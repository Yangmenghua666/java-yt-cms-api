package yt.parent.common.contants;
/**
 * 公共错误状态码枚举
 * @author yuanfei0241@hsyuntai.com
 * @version V1.0.0
 * @title CommenErrorMsg
 * @date 2019/10/18
 */
public enum CommenErrorMsg {

    EMPTY_PARAM(0,"入参为空"),
    NET_EXCEPTION(1,"网络异常"),
    RESULT_EMPTY(2,"找不到相应的数据"),
    SUCCESS(8,"调用成功");

    private Integer code;

    private String msg;

    CommenErrorMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
