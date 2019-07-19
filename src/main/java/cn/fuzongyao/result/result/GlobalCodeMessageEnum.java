package cn.fuzongyao.result.result;

/**
 * <p>公共的全局的应用层响应状态码枚举，一些常用的通用的响应状态码都应该放在这里</p>
 * 1~999是为公共、全局的响应状态码保留的
 * <ul>
 * <li>1~99为保留的xxx的响应状态码</li>
 * <li>100~199为保留的xxx的响应状态码</li>
 * <li>200~299为保留的xxx的响应状态码</li>
 * <li>……</li>
 * </ul>
 * 1000以上为具体业务的响应状态码，请在项目中的某个地方（比如README）说明具体的号段对应什么业务，比如：
 * <ul>
 * <li>1000~1999号段为用户子系统的响应状态码</li>
 * <ul>
 * <li>1000~1099为用户子系统的xxx的响应状态码</li>
 * <li>1100~1199为用户子系统的xxx的响应状态码</li>
 * </ul>
 * <li>2000~2999号段为订单子系统的响应状态码</li>
 * <ul>
 * <li>2000~2099为订单子系统的xxx的响应状态码</li>
 * <li>2100~2199为订单子系统的xxx的响应状态码</li>
 * </ul>
 * <li>……</li>
 * </ul>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public enum GlobalCodeMessageEnum implements CodeMessageInterface {
    /**
     * 1,success,成功
     */
    SUCCESS(1, "success"),
    /**
     * 2,fail,失败
     */
    FAIL(2, "fail"),
    /**
     * 3,error,系统错误/程序异常
     */
    ERROR(3, "error"),
    /**
     * 100,missing parameter,参数缺失
     */
    MISSING_PARAMETER(100, "missing parameter"),
    /**
     * 101,paramenter type inconformity,参数类型不一致
     */
    PARAMENTER_TYPE_INCONFORMITY(101, "paramenter type inconformity"),
    /**
     * 102,parameter not valid,参数不合法
     */
    PARAMENTER_NOT_VALID(102, "parameter not valid");

    /**
     * 状态码
     */
    private int code;
    /**
     * 消息
     */
    private String message;

    GlobalCodeMessageEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 状态码
     *
     * @return int
     */
    @Override
    public int getCode() {
        return this.code;
    }

    /**
     * 消息
     *
     * @return String
     */
    @Override
    public String getMessage() {
        return this.message;
    }
}
