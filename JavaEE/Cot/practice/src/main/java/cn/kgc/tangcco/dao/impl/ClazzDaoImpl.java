package cn.kgc.tangcco.dao.impl;

import cn.kgc.tangcco.dao.ClazzDao;
import cn.kgc.tangcco.pojo.Clazz;
import cn.kgc.tangcco.util.jdbc.JDBCUtil;
import com.alibaba.fastjson.JSON;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/29 12:21
 */
public class ClazzDaoImpl implements ClazzDao {
    @Override
    public List<Clazz> selectAllClazzs(Integer initial, Integer length) {
        List<Clazz> clazzlist = new ArrayList<>();
        JDBCUtil jdbcUtil = new JDBCUtil();
        ResultSet resultSet = null;
        if (initial != null && length != null) {
            resultSet = jdbcUtil.executeQuery("select * from class limit ?, ?", initial, length);
        } else {
            resultSet = jdbcUtil.executeQuery("select * from class");
        }
        try {
            while (resultSet.next()) {
                clazzlist.add(new Clazz(resultSet.getInt("id"), resultSet.getString("name")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtil.close();
            System.out.println("dao层 教室查看");
            clazzlist.forEach(clazz -> System.out.println(JSON.toJSONString(clazz)));
        }
        return clazzlist;
    }

    @Override
    public Integer insertOneClazz(Clazz clazz) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "insert into class(name) values (?)";
        Integer integer = 0;
        if (clazz != null) {
            System.out.println("dao层 教室添加");
            integer = jdbcUtil.executeUpdate(sql, clazz.getName());
            jdbcUtil.close();
            return integer;
        } else {
            System.out.println("dao层 教室添加失败");
            jdbcUtil.close();
            return integer;
        }
    }

    @Override
    public Integer selectClazzCount() {
        JDBCUtil jdbcUtil = new JDBCUtil();
        Integer count = null;
        ResultSet resultSet = jdbcUtil.executeQuery("select count(*) as count from class");
        System.out.println("获取class数据总数");
        try {
            if (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return count;
    }

    @Override
    public Clazz selectClazzById(Integer id) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "select * from class where id=?";
        Clazz clazz =null;
        System.out.println("dao层 按id查看教室信息");
        ResultSet resultSet = jdbcUtil.executeQuery(sql, id);
        try {
            if (resultSet.next()) {
                clazz = new Clazz(resultSet.getInt("id"), resultSet.getString("name"));
                jdbcUtil.close();
                return clazz;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return null;
    }

    @Override
    public Integer updateOneClazz(Clazz clazz) {
        JDBCUtil jdbcUtil = new JDBCUtil();

        String sql = "update class set name = ? where id = ?";
        Integer integer = 0;
        if (clazz != null) {
            System.out.println("dao层 教室修改");
            integer = jdbcUtil.executeUpdate(sql, clazz.getName(), clazz.getId());
            jdbcUtil.close();
            return integer;
        } else {
            System.out.println("dao层 教室修改失败");
            jdbcUtil.close();
            return integer;
        }
    }

    @Override
    public Integer deleteClazzById(Integer id) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "delete from class where id = ?";
        Integer integer = 0;
        if (id != null) {
            System.out.println("dao层 教室删除");
            integer = jdbcUtil.executeUpdate(sql, id);
            jdbcUtil.close();
            return integer;
        } else {
            System.out.println("dao层 教室删除失败");
            jdbcUtil.close();
            return integer;
        }
    }
}
