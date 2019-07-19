package cn.fuzongyao.result.util;


import cn.fuzongyao.result.constant.dictionary.DictionaryInterface;

import java.util.Objects;

/**
 * <p>字典工具类</p>
 *
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public class DictionaryUtil {
    /**
     * code to name
     *
     * @param code code
     * @return name
     */
    public static String getName(Class<? extends DictionaryInterface> dictionaryClass, Object code) {
        DictionaryInterface dictionary = get(dictionaryClass, code);
        return dictionary == null ? null : dictionary.getName();
    }

    /**
     * code to Dictionary
     *
     * @param code code
     * @return Dictionary
     */
    public static DictionaryInterface get(Class<? extends DictionaryInterface> dictionaryClass, Object code) {
        DictionaryInterface[] dictionarys = dictionaryClass.getEnumConstants();
        if (code == null) {
            return null;
        }

        for (DictionaryInterface dictionary : dictionarys) {
            if (Objects.equals(code, dictionary.getCode())) {
                return dictionary;
            }
        }
        return null;
    }

}
