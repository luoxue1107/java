package cn.kgc.tangcco.dao.impl;

import cn.kgc.tangcco.dao.CourseDao;
import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.util.jdbcUtil.JDBCUtil;
import com.alibaba.fastjson.JSON;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/2 20:10
 */
public class CourseDaoImpl implements CourseDao {
    @Override
    public List<Course> selectAllCourse() {
        List<Course> courseList = new ArrayList<>();
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "select * from course";
        ResultSet resultSet = jdbcUtil.executeQuery(sql);
        try {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("id"));
                courseList.add(new Course(resultSet.getInt("id"), resultSet.getString("name")));
            }
            courseList.forEach(course -> System.out.println(JSON.toJSONString(course)));
            return courseList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return courseList;
    }

    @Override
    public Course selectCourseById(Integer id) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "select * from course where id=?";
        ResultSet resultSet = jdbcUtil.executeQuery(sql, id);
        Course course = null;
        try {
            if (resultSet.next()) {
                course = new Course(resultSet.getInt("id"), resultSet.getString("name"));
            }
            return course;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return course;
    }

    @Override
    public Integer insertCourse(Course course) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql ="insert into class(name) values (?)";
        Integer integer = jdbcUtil.executeUpdate(sql, course.getId(), course.getName());
        jdbcUtil.close();
        return integer;
    }

    @Override
    public Integer updateCourse(Course course) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql ="update course set name = ? where id = ?";
        Integer integer = jdbcUtil.executeUpdate(sql, course.getName(), course.getId());
        jdbcUtil.close();
        return integer;
    }

    @Override
    public Integer deleteCourse(Integer id) {
        JDBCUtil jdbcUtil= new JDBCUtil();
        String sql = "delete from course where id = ?";
        Integer integer = jdbcUtil.executeUpdate(sql, id);
       jdbcUtil.close();
        return integer;

    }
}
