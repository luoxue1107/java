package cn.kgc.tangcco.dao.impl;

import cn.kgc.tangcco.dao.RelationDao;
import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.util.jdbcUtil.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 10:48
 */
public class RelationDaoImpl implements RelationDao {
    @Override
    public List<Integer> selectCidsBySid(Integer sid) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "select * from relation where sid=?";
        ResultSet resultSet = jdbcUtil.executeQuery(sql, sid);
        List<Integer> integers=new ArrayList<>();
        try {
            while (resultSet.next()) {
                integers.add(resultSet.getInt("cid"));
            }
            return integers;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return null;
    }

    @Override
    public Integer deleteCoursesBySid(Integer sid) {
        JDBCUtil jdbcUtil =new JDBCUtil();
        String sql= "delete from relation where sid = ?";
        Integer integer = jdbcUtil.executeUpdate(sql, sid);
        jdbcUtil.close();
        return integer;
    }

    @Override
    public List<Course> selectCoursesBySid(Integer sid) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "select c.* from course c, relation r where c.id=r.cid and r.sid = ?";
        ResultSet resultSet = jdbcUtil.executeQuery(sql, sid);
        List<Course> courseList=new ArrayList<>();
        try {
            while (resultSet.next()) {
                courseList.add(new Course(resultSet.getInt("cid"),resultSet.getString("name")));
            }
            return courseList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return null;
    }

    @Override
    public int[] insertStdCourses(Integer sid, Integer[] cids) {
        JDBCUtil jdbcUtil= new JDBCUtil();
        Integer[][] integers = new Integer[cids.length][2];
        for (int i = 0; i < cids.length; i++) {
            integers[i][0] = sid;
            integers[i][1] = cids[i];
        }
        String sql="insert into relation(sid,cid) values(?,?)";

        int[] ints = jdbcUtil.executeBatch(sql, integers);
        jdbcUtil.close();
        return ints;
    }
}