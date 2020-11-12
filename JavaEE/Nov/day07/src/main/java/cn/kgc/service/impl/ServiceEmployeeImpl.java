package cn.kgc.service.impl;

import cn.kgc.dao.impl.EmployeeDaoImpl;
import cn.kgc.pojo.Employee;
import cn.kgc.pojo.Role;
import cn.kgc.service.ServiceEmployee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 13:41
 */
public class ServiceEmployeeImpl  implements ServiceEmployee {
    EmployeeDaoImpl employ=new EmployeeDaoImpl();

    @Override
    public Integer setEmployee(Employee employee) {
   return employ.updateEmployee(employee);
    }
    @Override
    public Integer deleteEmployee(Integer id) {
        return employ.deleteEmployee(id);
    }
    @Override
    public Integer addEmployee(Employee employee) {
        return employ.insertEmployee(employee);
    }
    @Override
    public List<Employee> getEmployee() {
        return null;
    }

    @Override
    public Employee getEmployeeById(Integer id) {
       return employ.selectEmployeeById(id);
    }
}
