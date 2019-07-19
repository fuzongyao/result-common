package cn.fuzongyao.result.constant.dictionary;

/**
 * <p>字典接口，用作编码翻译。比如一个表字段is_deleted，值分别为0/1。0表示no，1表示yes</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public interface DictionaryInterface {
    /**
     * dictionary code
     *
     * @return code
     */
    <T> T getCode();

    /**
     * dictionary name
     *
     * @return name
     */
    String getName();
}
