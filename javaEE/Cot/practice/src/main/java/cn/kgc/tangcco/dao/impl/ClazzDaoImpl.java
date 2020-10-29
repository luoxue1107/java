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
        List<Clazz> clazzlist = new ArrayList<Clazz>();
        JDBCUtil jdbcUtil= new JDBCUtil();
        String sql= "select * from class";
        ResultSet resultSet = jdbcUtil.executeQuery(sql);

            try {
                while (resultSet.next()) {
                    clazzlist.add(new Clazz( resultSet.getInt("id"),resultSet.getString("name")));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                clazzlist.forEach(clazz -> System.out.println(JSON.toJSONString(clazz)));
            }
        return clazzlist;
    }
}
