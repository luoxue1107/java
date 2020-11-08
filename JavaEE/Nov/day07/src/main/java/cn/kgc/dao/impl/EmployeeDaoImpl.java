package cn.kgc.dao.impl;

import cn.kgc.dao.EmployeeDao;
import cn.kgc.pojo.Employee;
import cn.kgc.util.jdbc.JdbcUtil;
import com.alibaba.fastjson.JSON;

import  java.sql.*;
import java.util.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/7 14:16
 */
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public Integer insertEmployee(Employee employee) {
        JdbcUtil jdbcUtil = new JdbcUtil();
        String sql="insert into employee(name,cid) values (?,?)";
        Integer integer = jdbcUtil.executeUpdate(sql, employee.getName(),employee.getCid());

        jdbcUtil.close();

        return integer;

    }

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        String sql = "select e.id as eid, e.cid as ecid, e.name as name, c.name as cname from\n" +
                "employee as e inner join company as c on 1 and e.cid=c.id;";

        JdbcUtil jdbcUtil= new JdbcUtil();

        ResultSet resultSet = jdbcUtil.executeQuery(sql);
        try {
            while(resultSet.next()) {
                Employee employee = new Employee(resultSet.getInt("eid"),
                        resultSet.getString("name"),
                        resultSet.getInt("ecid"));
                employee.setCname(resultSet.getString("cname"));

                employeeList.add(employee);
            }
            employeeList.forEach(employee -> System.out.println(JSON.toJSONString(employee)));
            return employeeList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            jdbcUtil.close();
        }
    }
}
