package cn.kgc.service.impl;

import cn.kgc.dao.impl.EmployeeDaoImpl;
import cn.kgc.pojo.Employee;
import cn.kgc.service.ServiceEmployee;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 13:41
 */
public class ServiceEmployeeImpl  implements ServiceEmployee {
    EmployeeDaoImpl employ=new EmployeeDaoImpl();

    @Override
    public Integer addEmployee(Employee employee) {
        return employ.insertEmployee(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return employ.selectAllEmployee();
    }
}
