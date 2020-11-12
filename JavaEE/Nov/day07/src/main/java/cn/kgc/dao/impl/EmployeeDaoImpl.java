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
    public Integer updateEmployee(Employee employee) {
       JdbcUtil jdbcUtil = new JdbcUtil();
       String sql="update role set name = ?,cid=? where id = ?";
        Integer integer = jdbcUtil.executeUpdate(sql, employee.getName(), employee.getCid(), employee.getId());
        jdbcUtil.close();
        return integer;
    }

    @Override
    public Integer deleteEmployee(Integer id) {
        JdbcUtil jdbcUtil = new JdbcUtil();
        String sql="delete from employee where id = ?";
        Integer integer = jdbcUtil.executeUpdate(sql, id);
        jdbcUtil.close();
        return integer;
    }

    @Override
    public Employee selectEmployeeById(Integer id) {
        JdbcUtil jdbcUtil = new JdbcUtil();
        String sql ="select * from employee where 1 and id=?";
        ResultSet resultSet = jdbcUtil.executeQuery(sql, id);
        Employee employee=null;
        try {
            if (resultSet.next()) {
                 employee = new Employee(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("cid"));

            }
            System.out.println(JSON.toJSONString(employee));
            return  employee;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            jdbcUtil.close();
        }
        return null;
    }

    @Override
    public List<Employee> selectAllEmployee(Integer initial, Integer length) {
        List<Employee> employeeList = new ArrayList<>();

        String sql = "select e.id as eid, e.cid as ecid, e.name as name, c.name as cname from\n" +
                "employee as e inner join company as c on 1 and e.cid=c.id limit ?, ?";

        JdbcUtil jdbcUtil= new JdbcUtil();

        ResultSet resultSet = jdbcUtil.executeQuery(sql,initial,length);
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
