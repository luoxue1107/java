package cn.kgc.dao;


import cn.kgc.pojo.Employee;
import java.util.List;

/**
 * @author 李庆华
 * @Description 连接数据库员工信息接口
 * @date 2020/11/7 13:44
 */
public interface EmployeeDao {
    public List<Employee> selectAllEmployee();
    public Integer insertEmployee( Employee employee);
}
