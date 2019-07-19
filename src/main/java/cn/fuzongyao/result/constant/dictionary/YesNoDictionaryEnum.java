package cn.fuzongyao.result.constant.dictionary;

/**
 * <p>是/否的字典枚举</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public enum YesNoDictionaryEnum implements DictionaryInterface {
    /**
     * 1,yes
     */
    YES(1, "yes"),
    /**
     * 0,no
     */
    NO(0, "no");
    private Integer code;
    private String name;

    YesNoDictionaryEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * dictionary code
     *
     * @return code
     */
    @Override
    public <T> T getCode() {
        return (T) this.code;
    }

    /**
     * dictionary name
     *
     * @return name
     */
    @Override
    public String getName() {
        return this.name;
    }
}
