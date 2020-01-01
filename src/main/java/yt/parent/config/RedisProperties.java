package yt.parent.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取redis配置信息并装载
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title RedisProperties
 * @date 2019/10/16
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {

    private int expireSeconds;

    private String clusterNodes;

    private String password;

    private int commandTimeout;

    public int getExpireSeconds() {
        return expireSeconds;
    }

    public void setExpireSeconds(int expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public String getClusterNodes() {
        return clusterNodes;
    }

    public void setClusterNodes(String clusterNodes) {
        this.clusterNodes = clusterNodes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCommandTimeout() {
        return commandTimeout;
    }

    public void setCommandTimeout(int commandTimeout) {
        this.commandTimeout = commandTimeout;
    }
}
