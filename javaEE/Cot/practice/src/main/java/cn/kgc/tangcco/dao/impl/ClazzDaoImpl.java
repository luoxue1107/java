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
    public List<Clazz> selectAllClazzs() {
        List<Clazz> clazzlist = new ArrayList<>();
        JDBCUtil jdbcUtil= new JDBCUtil();
        String sql= "select * from class";
        ResultSet resultSet = jdbcUtil.executeQuery(sql);

            try {
                while (resultSet.next()) {
                    clazzlist.add(new Clazz( resultSet.getInt("id"),resultSet.getString("name")));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.out.println("dao层 教室查看");
                clazzlist.forEach(clazz -> System.out.println(JSON.toJSONString(clazz)));
            }
            jdbcUtil.close();
        return clazzlist;
    }

    @Override
    public Integer insertOneClazz(Clazz clazz) {
        JDBCUtil jdbcUtil= new JDBCUtil();
        String sql= "insert into class(name) values (?)";
        System.out.println("dao层 教室添加");
        jdbcUtil.close();
        return jdbcUtil.executeUpdate(sql, clazz.getName());
    }

    @Override
    public Clazz selectClazzById(Integer id) {
        return null;
    }

    @Override
    public Integer updateOneClazz(Clazz clazz) {
        return null;
    }

    @Override
    public Integer deleteClazzById(Integer id) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql="delete from class where id = ?";
        if (id != null) {
            System.out.println("dao层 教室删除");
            jdbcUtil.close();
            return jdbcUtil.executeUpdate(sql,id);
        }else {
            jdbcUtil.close();
            return 0;
        }
    }
}
