package cn.fuzongyao.result.result;

/**
 * <p>API单个对象返回结果</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public class ObjectResult<T> extends BaseResult {
    private T data;

    public ObjectResult(CodeMessageInterface codeMessage) {
        super(codeMessage);
    }

    public static <T> ObjectResult<T> succeed(T data) {
        ObjectResult<T> result = new ObjectResult<>(GlobalCodeMessageEnum.SUCCESS);
        result.data = data;
        return result;
    }

    public static <T> ObjectResult<T> fail(CodeMessageInterface codeMessage) {
        return new ObjectResult<>(codeMessage);
    }

    public T getData() {
        return data;
    }

    public ObjectResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ObjectResult{" +
                "code=" + this.getCode() +
                ", message='" + this.getMessage() + '\'' +
                ", data=" + data +
                "} ";
    }
}
