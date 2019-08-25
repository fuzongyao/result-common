package cn.fuzongyao.result.result;


import cn.fuzongyao.result.constant.PageConstant;

import java.util.Collections;
import java.util.List;

/**
 * @author fuzongyao
 * @date 2019-07-02 12:32
 * @since 1.0
 */
public class Page<T> {
    /**
     * 页码
     */
    private Integer pageNumber = PageConstant.DEFAULT_PAGE_NUMBER;
    /**
     * 分页大小
     */
    private Integer pageSize = PageConstant.DEFAULT_PAGE_SIZE;
    /**
     * 总页数
     */
    private Integer totalPageNumber = 0;
    /**
     * 总数据量
     */
    private Long total = 0L;
    /**
     * 是否有下一页
     */
    private Boolean hasNext = Boolean.FALSE;
    /**
     * 当前分页的数据
     */
    private List<T> items = Collections.emptyList();

    public Page() {
    }

    public Page(Integer pageNumber, Integer pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public Page(Integer pageNumber, Integer pageSize, Integer totalPageNumber, Long total, Boolean hasNext, List<T> items) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalPageNumber = totalPageNumber;
        this.total = total;
        this.hasNext = hasNext;
        this.items = items;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Page<T> setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Page<T> setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalPageNumber() {
        return totalPageNumber;
    }

    public Page<T> setTotalPageNumber(Integer totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public Page<T> setTotal(Long total) {
        this.total = total;
        return this;
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public Page<T> setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }

    public List<T> getItems() {
        return items;
    }

    public Page<T> setItems(List<T> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", totalPageNumber=" + totalPageNumber +
                ", total=" + total +
                ", hasNext=" + hasNext +
                ", items=" + items +
                '}';
    }
}
