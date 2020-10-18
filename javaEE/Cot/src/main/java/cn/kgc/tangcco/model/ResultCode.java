package cn.kgc.tangcco.model;

/**
 * @author 李庆华
 * @Description
 * @create 2020/9/6 上午9:15
 */
public enum ResultCode {
    /**
     * 操作成功 请求成功
     */
    SUCCESS("200", "操作成功", "请求成功"),

    /**
     * 参数错误 参数为空或格式不正确
     */
    PARAM_ERROR("10001", "参数错误", "参数为空或格式不正确"),

    /**
     * appKey异常 appKey被冻结
     */
    APPKEY_ERROR("10005", "appKey异常", "appKey被冻结"),

    /**
     * appKey不存在 确认appKey是否正确
     */
    APPKEY_NOTHINGNESS("10017", "appKey不存在", "确认appKey是否正确"),

    /**
     * appkey和appSecret不匹配
     */
    APPKEY_MISMATCHING("10030", "appkey和appSecret不匹配", "appkey和appSecret不匹配"),

    /**
     * 数据异常 接口调用异常
     */
    DATA_ERROR("49999", "数据异常", "接口调用异常"),
    /**
     * 登录成功
     */
    LOGIN_SUCCESS("65000","登录成功","登录成功"),

    /**
     * 登录失败 接口调用异常
     */
    LOGIN_FAILED("65001","登录失败","登录失败");


    /**
     * 状态码
     */
    private String code;
    /**
     * 状态码含义
     */
    private String msg;
    /**
     * 状态码含义描述
     */
    private String desc;

    ResultCode(String code, String msg, String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getDesc() {
        return desc;
    }
}
