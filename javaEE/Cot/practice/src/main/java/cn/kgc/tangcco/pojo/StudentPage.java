package cn.kgc.tangcco.pojo;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/29 11:48
 */
public class StudentPage {
    /**
     * 学生对象集合
     */
    private List<Student> students ;
    /**
     * 行数
     */
    private  Integer rowCount;
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

    public List<Student> getStudents() {
        return students;
    }

    public StudentPage(List<Student> students, Integer rowCount, Integer pageSize, Integer pageCount, Integer pageNum) {
        this.students = students;
        this.rowCount = rowCount;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.pageNum = pageNum;
    }
    public StudentPage(){}

    public void setStudents(List<Student> students) {
        this.students = students;
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
