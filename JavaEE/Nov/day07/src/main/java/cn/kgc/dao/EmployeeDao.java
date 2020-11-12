package cn.kgc.dao;


import cn.kgc.pojo.Employee;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * @author 李庆华
 * @Description 连接数据库员工信息接口
 * @date 2020/11/7 13:44
 */
public interface EmployeeDao {
    List<Employee> selectAllEmployee(Integer initial, Integer length);
    Integer insertEmployee( Employee employee);
    Integer deleteEmployee(Integer id);
    Integer updateEmployee(Employee employee);
    Employee selectEmployeeById(Integer id);
}
