package cn.kgc.tangcco.model;
/**
 * @author 李庆华
 * @Description
 * @create 2020/9/5 上午11:58
 */
public class ResposeText<T>{
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态码含义
     */
    private String msg;
    /**
     * 数据封装
     */
    private T data;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResposeText(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResposeText() {
    }
}
