package cn.kgc.pojo;

import java.util.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 8:29
 */
public class Page {
    /**
     * 员工对象集合
     */
    private List<Employee> employeeList;
    /**
     *
     */
    private List<Role> roleList;
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

    public Page(List<Employee> emptyList, List<Role> roleList, Integer rowCount, Integer pageSize, Integer pageCount, Integer pageNum) {
        this(emptyList, rowCount, pageSize, pageCount, pageNum);
        this.roleList = roleList;

    }

    public Page(List<Employee> emptyList,Integer rowCount, Integer pageSize, Integer pageCount, Integer pageNum) {
        this.employeeList = emptyList;
        this.rowCount = rowCount;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.pageNum = pageNum;
    }

    public Page() {
    }


    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
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
