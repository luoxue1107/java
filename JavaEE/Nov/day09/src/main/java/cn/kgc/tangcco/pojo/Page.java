package cn.kgc.tangcco.pojo;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 8:29
 */
public class Page {
    /**
     * 新闻对象集合
     */
    private List<Journalism> journalismList;
    /**
     *作者集合
     */
    private List<Author> authorList;
    /**
     * 行数
     */
    private Integer rowCount;
    /**
     * 总页数
     */
    private Integer pageSize;
    /**
     * 页数
     */
    private Integer pageCount;
    /**
     * 当前页码
     */
    private Integer pageNum;

    public Page(List<Journalism> journalismList, List<Author> authorList, Integer rowCount, Integer pageSize, Integer pageCount, Integer pageNum) {
        this(journalismList, rowCount, pageSize, pageCount, pageNum);
        this.authorList = authorList;

    }

    public Page(List<Journalism> journalismList, Integer rowCount, Integer pageSize, Integer pageCount, Integer pageNum) {
        this.journalismList = journalismList;
        this.rowCount = rowCount;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.pageNum = pageNum;
    }

    public Page() {
    }

    public List<Journalism> getJournalismList() {
        return journalismList;
    }

    public void setJournalismList(List<Journalism> journalismList) {
        this.journalismList = journalismList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
