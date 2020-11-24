package cn.kgc.dao.impl;

import cn.kgc.dao.DepartmentDao;
import cn.kgc.pojo.Department;
import cn.kgc.util.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 17:10
 */
public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public List<Department> selectDepartment() {
        JDBCUtil jdbc = new JDBCUtil();
        String sql = "select * from department";
        ResultSet rs = jdbc.executeQuery(sql);
        List<Department> departmentList = new ArrayList<Department>();
        try {
            while (rs.next()) {
                departmentList.add(new Department(rs.getInt("uid"), rs.getString("name")));
            }
            return departmentList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer insertDepartment(Department department) {
        JDBCUtil jdbc = new JDBCUtil();
        String sql = "insert into department(name) values (?)";
        Integer integer = jdbc.executeUpdate(sql, department.getName());
        jdbc.close();
        return integer;
    }

    @Override
    public Integer deleteDepartmentDyId(Integer id) {
        JDBCUtil jdbc = new JDBCUtil();
        String sql="delete from department where uid=?";
        Integer integer = jdbc.executeUpdate(sql, id);
        jdbc.close();
        return integer;
    }

    @Override
    public Integer[] deleteDepartments(Integer[] integers) {
        JDBCUtil jdbc = new JDBCUtil();
        String sql="delete from department where uid=?";
        Integer[]  integer = new Integer[integers.length];
        for (int i = 0; i < integers.length; i++) {
            integer[i] = jdbc.executeUpdate(sql, integers[i]);
        }
       return integer;
    }

    @Override
    public Integer updateDepartment(Department department) {
        JDBCUtil jdbc = new JDBCUtil();
        String sql="update department set name=? where uid=?";
        Integer integer = jdbc.executeUpdate(sql, department.getName(), department.getUid());
        jdbc.close();
        return  integer;
    }

    @Override
    public Department selectDepartmentById(Integer id) {
        JDBCUtil jdbc = new JDBCUtil();
        ResultSet resultSet = jdbc.executeQuery("select * from department where uid=?", id);
    Department department =null;
       try {
        if (resultSet.next()) {
           department= new Department(resultSet.getInt("uid"), resultSet.getString("name"));
        }
        return department;
       }catch (SQLException e) {
           e.printStackTrace();
       }
return null;
    }
}
