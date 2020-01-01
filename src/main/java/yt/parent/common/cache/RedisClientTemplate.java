package yt.parent.common.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Redis客户端工具类（数据都以fastJSon字符串形式存储）
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title RedisClientTemplate
 * @date 2019/10/16
 */
@Repository("redisClientTemplate")
public class RedisClientTemplate {

    private static final Logger LOGGER    = LoggerFactory.getLogger(RedisClientTemplate.class);
    
    @Autowired
    private JedisCluster jedisCluster;

    /**
     * 获取key对应的值
     * 如果key不存在，返回null.如果key存储的值不知String，则返回错误，GET只能操作String类型
     * @param key
     * @return key对应的值；如果key不存在，则返回null
     */
    public String get(String key) {
        try {
            return jedisCluster.get(key);
        } catch (Exception e) {
            LOGGER.error("[Redis查询]-获取key" + key + "信息时出现异常", e);
        }
        return null;
    }

    /**
     * 设置key对应的值
     *
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        try {
            jedisCluster.set(key, value);
        } catch (Exception e) {
            LOGGER.error("[Redis存储]-存储key" + key + "信息时出现异常", e);
        }
    }

    /**
     * 设置key对应的值,并指定时间
     * @param key
     * @param value
     * @param seconds
     */
    public void set(String key, String value, Integer seconds) {
        try {
            jedisCluster.set(key, value);
            this.expire(key, seconds);
        } catch (Exception e) {
            LOGGER.error("[Redis存储]-存储key" + key + "信息时出现异常", e);
        }
    }

    /**
     * 删除key
     * @param key
     * @return
     */
    public long del(String key) {
        try {
            return jedisCluster.del(key);
        } catch (Exception e) {
            LOGGER.error("[Redis删除]-删除key" + key + "信息时出现异常", e);
        }
        return 0;
    }

    /**
     * 支持通配符key的批量删除服务
     * @param keys
     * @return long
     */
    public long delMatch(String keys) {
        try {
            TreeSet<String> keySet = new TreeSet<>();
            Map<String, JedisPool> clusterNodes = this.jedisCluster.getClusterNodes();
            clusterNodes.forEach((k, n) -> {
                try {
                    keySet.addAll(n.getResource().keys(keys));
                } catch (Exception e) {
                    //不做任何处理
                } finally {
                    //用完一定要close这个链接！！！
                    n.getResource().close();
                }
            });
            AtomicLong ai = new AtomicLong(0);
            if (!keySet.isEmpty()) {
                keySet.forEach((k) -> {
                    ai.addAndGet(del(k));
                });
            }
            return ai.get();
        } catch (Exception e) {
            LOGGER.error("[Redis删除]-模糊删除key" + keys + "信息时出现异常", e);
        }
        return 0;
    }

    /**
     * 向列表的右端push元素
     * 如果key不存在，则会先创建一个空队列；如果key存储的值不是列表，则报错
     * @param key
     * @param value
     * @return 操作完成之后队列的长度
     */
    public long rpush(String key, String... value) {
        try {
            return jedisCluster.rpush(key, value);
        } catch (Exception e) {
            LOGGER.error("[Redis插入]-右插入key" + key + "信息时出现异常", e);
        }
        return 0;
    }


    /**
     * 向列表的左端push元素
     * 如果key不存在，则会先创建一个空队列；如果key存储的值不是列表，则发生错误
     * @param key
     * @param value
     * @return 操作完成之后队列的长度
     */
    public long lpush(String key, String value) {
        try {
            return jedisCluster.lpush(key, value);
        } catch (Exception e) {
            LOGGER.error("[Redis插入]-左插入key" + key + "信息时出现异常", e);
        }
        return 0;
    }

    /**
     * 返回列表的长度
     * 如果key不存在，则返回0；如果key存储的值不是列表，则发生错误
     * @param key
     * @return 列表的长度。如果key不存在，返回0
     */
    public long llen(String key) {
        try {
            return jedisCluster.llen(key);
        } catch (Exception e) {
            LOGGER.error("[Redis长度]-查询列表长度key" + key + "信息时出现异常", e);
        }
        return 0;
    }

    /**
     * 从列表右端移除元素并返回
     * @param key
     * @return 列表最右端的元素，null-如果列表不存在
     */
    public String rpop(String key) {
        try {
            return jedisCluster.rpop(key);
        } catch (Exception e) {
            LOGGER.error("[Redis取值]-右取值key" + key + "信息时出现异常", e);
        }
        return null;
    }

    /**
     * 从列表的左端移除元素并返回
     * @param key
     * @return 列表最左端的元素，null-如果列表不存在
     */
    public String lpop(String key) {
        try {
            return jedisCluster.lpop(key);
        } catch (Exception e) {
            LOGGER.error("[Redis取值]-左取值key" + key + "信息时出现异常", e);
        }
        return null;
    }

    /**
     * 获取指定范围的列表数据并返回
     * @param key
     * @param start
     * @param end
     * @return
     */
    public List<String> lrange(String key, long start, long end) {
        try {
            return jedisCluster.lrange(key, start, end);
        } catch (Exception e) {
            LOGGER.error("[Redis取值]-范围取值key" + key + "信息时出现异常", e);
        }
        return null;
    }

    /**
     * 移除列表中所有于指定值相等的元素
     * @param key
     * @param value
     * @return 被移除的元素的数量
     */
    public long lrem(String key, String value) {
        try {
            return jedisCluster.lrem(key, 0, value);
        } catch (Exception e) {
            LOGGER.error("[Redis移值]-移除值key" + key + "信息时出现异常", e);
        }
        return 0;
    }

    /**
     * 设置key的有效时长
     * @param key
     * @param seconds
     * @return true-设置成功 false-key不存在或设置失败
     */
    public boolean expire(String key, int seconds) {
        try {
            return jedisCluster.expire(key, seconds) > 0;
        } catch (Exception e) {
            LOGGER.error("[Redis时常]-设置时常key" + key + "信息时出现异常", e);
        }
        return false;
    }

    /**
     * 向set中添加值
     * 如果key不存在，则先创建一个空集合；如果key指定的值不是set，则发生错误。
     * 如果要添加的值原本已经存在，则不添加并返回false；否则添加并返回true。
     * @param key
     * @param value
     * @return true-集合中不存在该值 false-集合中已经存在该值
     */
    public boolean sadd(String key, String value) {
        try {
            return jedisCluster.sadd(key, value) > 0;
        } catch (Exception e) {
            LOGGER.error("[Redis集合]-添加集合数据key" + key + "信息时出现异常", e);
        }
        return false;
    }

    /**
     * 从set中移除与指定值相等的元素
     * @param key
     * @param value
     * @return true-如果移除成功 false-set不存在或者元素不存在
     */
    public boolean srem(String key, String value) {
        try {
            return jedisCluster.srem(key, value) > 0;
        } catch (Exception e) {
            LOGGER.error("[Redis集合]-删除集合数据key" + key + "信息时出现异常", e);
        }
        return false;
    }

    /**
     * 随机从set中移除并返回一个元素
     * @param key
     * @return 从set中移除的元素，null-如果set不存在
     */
    public String spop(String key) {
        try {
            return jedisCluster.spop(key);
        } catch (Exception e) {
            LOGGER.error("[Redis集合]-获取集合数据key" + key + "信息时出现异常", e);
        }
        return null;
    }

    /**
     * 返回set的元素数量
     * @param key
     * @return
     */
    public long ssize(String key) {
        try {
            return jedisCluster.scard(key);
        } catch (Exception e) {
            LOGGER.error("[Redis集合]-获取集合大小key" + key + "信息时出现异常", e);
        }
        return 0;
    }

    /**
     * 判断set中是否存在与指定值相等的元素
     * @param key
     * @param value
     * @return true-如果存在 false-如果不存在或者set不存在
     */
    public boolean sIsMember(String key, String value) {
        try {
            return jedisCluster.sismember(key, value);
        } catch (Exception e) {
            LOGGER.error("[Redis集合]-集合是否存在key" + key + "信息时出现异常", e);
        }
        return false;
    }

    /**
     * 获取set的所有元素
     * @param key
     * @return
     */
    public Set<String> smembers(String key) {
        try {
            return jedisCluster.smembers(key);
        } catch (Exception e) {
            LOGGER.error("[Redis集合]-获取所有元素key" + key + "信息时出现异常", e);
        }
        return null;
    }

    /**
     * 将key存储的数字加1
     * 如果key不存在或者key存储的值的类型不正确，则先将key对应的值置为0再操作
     * @param key
     * @return 操作成功之后key存储的新值
     */
    public long incr(final String key) {
        return jedisCluster.incr(key);
    }

    /**
     * key存储的数字加delta
     * 类似于incr操作，只不过加的是delta
     * @param key
     * @param delta
     * @return 操作成功之后key存储的新值
     */
    public long incrBy(final String key, final long delta) {
        return jedisCluster.incrBy(key, delta);
    }

    /**
     * key存储的数字减1
     * 如果key不存在或者key存储的值的类型不正确，则先将key对应的值置为0，再执行减1操作
     * @param key
     * @return 操作成功之后key存储的新值
     */
    public long decr(final String key) {
        return jedisCluster.decr(key);
    }

    /**
     * key存储的数字减delta
     * 类似于decr操作，只不过减的是delta
     * @param key
     * @param delta
     * @return 操作成功之后key存储的新值
     */
    public long decrBy(final String key, final long delta) {
        return jedisCluster.decrBy(key, delta);
    }

    /**
     * 将key存储的散列表的field的数字加1
     * 如果key不存在则创建一个空的散列表；如果field不存在或者类型不正确，则先将field的值置为0
     * @param key
     * @return 操作成功之后key存储的新值
     */
    public long hincr(String key, String field) {
        return jedisCluster.hincrBy(key, field, 1);
    }

    /**
     * 将key存储的散列表的field的数字加count
     * 如果key不存在则创建一个空的散列表；如果field不存在或者类型不正确，则先将field的值置为0
     * @param key
     * @return 操作成功之后key存储的新值
     */
    public long hincrBy(String key, String field,long count) {
        return jedisCluster.hincrBy(key, field, count);
    }

    /**
     * 将key存储的散列表的field的数字减1
     * 如果key不存在则创建一个空的散列表；如果field不存在或者类型不正确，则先将field的值置为0
     * @param key
     * @return 操作成功之后key存储的新值
     */
    public long hdecr(String key, String field) {
        return jedisCluster.hincrBy(key, field, -1);
    }

    /**
     * 将key存储的散列表的field的数字减少指定值
     * 如果key不存在则创建一个空的散列表；如果field不存在或者类型不正确，则先将field的值置为0
     * @param key
     * @param field
     * @param delta
     * @return 操作成功之后key存储的新值
     */
    public long hdecrBy(String key, String field, long delta) {
        return jedisCluster.hincrBy(key, field, -delta);
    }

    /**
     * 将key存储的散列表中field的值
     * 如果key或者field不存在，返回null
     * @param key
     * @param field
     * @return key存储的散列表中field的值
     */
    public String hget(String key, String field) {
        return jedisCluster.hget(key, field);
    }

    /**
     * 设置key存储的散列表中的field
     * 如果key不存在，则新创建一个空的散列表
     * @param key
     * @param field
     * @param value
     */
    public void hset(String key, String field, String value) {
        jedisCluster.hset(key, field, value);
    }

    /**
     * 消息内容信息
     * @param s
     * @return Map<String, String>
     */
    public Map<String, String> hall(String s) {
        return jedisCluster.hgetAll(s);
    }

    /**
     * 移除hset 某一个字段
     * @param key
     * @param field
     */
    public void hdel(String key, String field) {
        jedisCluster.hdel(key, field);
    }
}
