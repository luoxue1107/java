package cn.kgc.tangcco.dao.impl;

import cn.kgc.tangcco.dao.StudentDao;
import cn.kgc.tangcco.pojo.Student;
import cn.kgc.tangcco.util.jdbc.JDBCUtil;
import com.alibaba.fastjson.JSON;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/28 11:07
 */
public class StudentDaoImpl  implements StudentDao {
    @Override
    public List<Student> selectStudents(Integer initial, Integer length) {
        List<Student> Students= new ArrayList<Student>();

        String sql = "select s.id, s.name, s.sex, s.birthday, c.id as cid, c.name as cname from student s left join class c on s.class=c.id limit ?, ?";
        JDBCUtil jdbcUtil = new JDBCUtil();
        ResultSet resultSet = jdbcUtil.executeQuery(sql, initial, length);

            try {
               while (resultSet.next()) {
                   Students.add(new Student(resultSet.getInt("id"),
                           resultSet.getString("name"),resultSet.getString("sex"),
                           resultSet.getDate("birthday"),resultSet.getInt("cid"),
                           resultSet.getString("cname")));
               }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                Students.forEach(student -> System.out.println(JSON.toJSONString(student)));
                jdbcUtil.close();
            }
        return Students;
    }



    @Override
    public Integer selectStudentsCount() {
        JDBCUtil jdbcUtil = new JDBCUtil();
        Integer count=null;

        ResultSet resultSet = jdbcUtil.executeQuery("select count(*) as count from student");

        try {
            if (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            jdbcUtil.close();
        }

        return count;
    }
}
