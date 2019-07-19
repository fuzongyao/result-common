package cn.fuzongyao.result.result;

import java.util.Collection;

/**
 * <p>API集合类返回结果</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public class CollectionResult<T> extends BaseResult {
    private Collection<T> data;

    public CollectionResult(CodeMessageInterface codeMessage) {
        super(codeMessage);
    }

    public static <T> CollectionResult<T> succeed(Collection<T> data) {
        CollectionResult<T> result = new CollectionResult<>(GlobalCodeMessageEnum.SUCCESS);
        result.data = data;
        return result;
    }

    public static <T> CollectionResult<T> fail(CodeMessageInterface codeMessage) {
        return new CollectionResult<>(codeMessage);
    }

    public Collection<T> getData() {
        return data;
    }

    public CollectionResult<T> setData(Collection<T> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "CollectionResult{" +
                "code=" + this.getCode() +
                ", message='" + this.getMessage() + '\'' +
                ", data=" + data +
                "} ";
    }
}
