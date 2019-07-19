package cn.fuzongyao.result.exception;


import cn.fuzongyao.result.result.CodeMessageInterface;

/**
 * <p>业务异常，所有对外接口的异常处理都应该抛出此异常，然后由全局异常拦截处理返回结果</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public class BizException extends RuntimeException {
    /**
     * 业务异常状态码
     */
    private int code;
    /**
     * 业务异常消息
     */
    private String message;

    public BizException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BizException(CodeMessageInterface codeMessage) {
        this.code = codeMessage.getCode();
        this.message = codeMessage.getMessage();
    }

    public int getCode() {
        return code;
    }

    public BizException setCode(int code) {
        this.code = code;
        return this;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public BizException setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "BizException{" +
                "code=" + code +
                ", message='" + message + '\'' +
                "} " + super.toString();
    }
}
