package cn.fuzongyao.result.result;

/**
 * <p>定义应用层响应状态码接口</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public interface CodeMessageInterface {
    /**
     * 状态码
     *
     * @return int
     */
    int getCode();

    /**
     * 消息
     *
     * @return String
     */
    String getMessage();
}
