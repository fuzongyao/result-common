package cn.fuzongyao.result.result;

/**
 * <p>API分页返回结果</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public class PageResult<T> extends BaseResult {
    private Page<T> data;

    public PageResult(CodeMessageInterface codeMessage) {
        super(codeMessage);
    }

    public static <T> PageResult<T> succeed(Page<T> data) {
        PageResult<T> result = new PageResult<>(GlobalCodeMessageEnum.SUCCESS);
        result.data = data;
        return result;
    }

    public static <T> PageResult<T> fail(CodeMessageInterface codeMessage) {
        return new PageResult<>(codeMessage);
    }

    public Page<T> getData() {
        return data;
    }

    public PageResult<T> setData(Page<T> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "code=" + this.getCode() +
                ", message='" + this.getMessage() + '\'' +
                ", data=" + data +
                "} ";
    }
}
