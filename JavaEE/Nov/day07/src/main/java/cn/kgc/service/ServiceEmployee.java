package cn.kgc.service;

import cn.kgc.pojo.Employee;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 13:33
 */
public interface ServiceEmployee {
    List<Employee> getEmployee();
    Integer addEmployee(Employee employee);
}
