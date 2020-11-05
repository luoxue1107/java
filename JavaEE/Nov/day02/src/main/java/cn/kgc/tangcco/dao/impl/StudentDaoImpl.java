package cn.kgc.tangcco.dao.impl;

import cn.kgc.tangcco.dao.StudentDao;
import cn.kgc.tangcco.pojo.Student;
import cn.kgc.tangcco.util.jdbcUtil.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/2 20:11
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> selectAllStudent() {
        JDBCUtil jdbcUtil = new JDBCUtil();
        List<Student> studentList = new ArrayList<>();
        String sql = "select *  from student";
        ResultSet resultSet = jdbcUtil.executeQuery(sql);
        try {
            while (resultSet.next()) {
                studentList.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("sex"),
                        resultSet.getDate("birthday")));
            }
            return studentList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return null;
    }
}
