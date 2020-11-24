package cn.kgc.pojo;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 15:33
 */
public class Page {

    private List<Doctor> doctor;

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


    public Page(List<Doctor> doctor, Integer rowCount, Integer pageSize, Integer pageCount, Integer pageNum) {
        this.doctor = doctor;
        this.rowCount = rowCount;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.pageNum = pageNum;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
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
