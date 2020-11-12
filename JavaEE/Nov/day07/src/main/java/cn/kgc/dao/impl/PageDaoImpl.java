package cn.kgc.dao.impl;

import cn.kgc.dao.PageDao;
import cn.kgc.util.jdbc.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 12:08
 */
public class PageDaoImpl implements PageDao {
    @Override
    public Integer selectTotalPage() {
        JdbcUtil jdbcUtil= new JdbcUtil();
        String sql="select count(*) as count from employee";
        ResultSet resultSet = jdbcUtil.executeQuery(sql);
        int count=0;
        try {
            if (resultSet.next()) {
             count = resultSet.getInt("count");
            System.out.println(count);
            }
            return count;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            jdbcUtil.close();
        }
        return 0;
    }
}
