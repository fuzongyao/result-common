package cn.fuzongyao.result.result;


import cn.fuzongyao.result.exception.BizException;

/**
 * <p>API返回结果基类</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public class BaseResult {
    /**
     * 状态码
     */
    private int code;
    /**
     * 消息
     */
    private String message;
    /**
     * success,成功
     */
    public static final BaseResult SUCCESS_RESULT = new BaseResult(GlobalCodeMessageEnum.SUCCESS);

    public BaseResult() {
        super();
    }

    public BaseResult(CodeMessageInterface codeMessage) {
        setCodeMessage(codeMessage);
    }

    public BaseResult(BizException bizException) {
        setCode(bizException.getCode());
        setMessage(bizException.getMessage());
    }

    public BaseResult setCodeMessage(CodeMessageInterface codeMessage) {
        setCode(codeMessage.getCode());
        setMessage(codeMessage.getMessage());
        return this;
    }

    public int getCode() {
        return code;
    }

    public BaseResult setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BaseResult setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
