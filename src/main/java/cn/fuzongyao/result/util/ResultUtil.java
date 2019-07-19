package cn.fuzongyao.result.util;

import cn.fuzongyao.result.result.BaseResult;
import cn.fuzongyao.result.result.CollectionResult;
import cn.fuzongyao.result.result.GlobalCodeMessageEnum;
import cn.fuzongyao.result.result.ObjectResult;
import cn.fuzongyao.result.result.Page;
import cn.fuzongyao.result.result.PageResult;

import java.util.Collection;

/**
 * <p>API返回结果工具类</p>
 *
 * @author fuzongyao
 * @date 2019-07-16 13:26
 * @since 1.0
 */
public class ResultUtil {

    /**
     * <p>判断结果是否成功</p>
     * 除了code==1表示成功外，其它都是失败
     *
     * @param baseResult API返回结果基类
     * @return boolean
     */
    public static boolean isSuccess(BaseResult baseResult) {
        return baseResult != null && baseResult.getCode() == GlobalCodeMessageEnum.SUCCESS.getCode();
    }

    /**
     * <p>判断结果是否失败</p>
     * 除了code==1表示成功外，其它都是失败
     *
     * @param baseResult API返回结果基类
     * @return boolean
     */
    public static boolean isNotSuccess(BaseResult baseResult) {
        return !isSuccess(baseResult);
    }

    /**
     * <p>判断结果的data是否为空</p>
     * 除了code==1表示成功外，其它都是失败
     *
     * @param baseResult API返回结果基类
     * @return boolean
     */
    public static <T extends BaseResult> boolean isEmpty(T baseResult) {
        if (isNotSuccess(baseResult)) {
            return true;
        }

        if (baseResult instanceof ObjectResult) {
            return ((ObjectResult) baseResult).getData() == null;
        }
        if (baseResult instanceof CollectionResult) {
            Collection data = ((CollectionResult) baseResult).getData();
            return data == null || data.isEmpty();
        }
        if (baseResult instanceof PageResult) {
            Page data = ((PageResult) baseResult).getData();
            return data == null || data.getItems() == null || data.getItems().isEmpty();
        }
        return true;
    }

    /**
     * <p>判断结果的data是否为空</p>
     * 除了code==1表示成功外，其它都是失败
     *
     * @param baseResult API返回结果基类
     * @return boolean
     */
    public static <T extends BaseResult> boolean isNotEmpty(T baseResult) {
        return !isEmpty(baseResult);
    }

}
