package dao;

import util.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 11:26
 */
public class CartDaoImpl implements CartDao {
    @Override
    public Integer[] deleteCartById(Integer[] integers) {
        JDBCUtil jdbc = new JDBCUtil();
        String sql = "delete from cart where productId=?";
        Integer[] integer = new Integer[integers.length];
        for (int i = 0; i < integers.length; i++) {
            integer[i] = jdbc.executeUpdate(sql, integers[i]);
        }
        jdbc.close();
        return integer;
    }

    @Override
    public Integer updateCart(Integer[] inters) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String sql = "update cart set number=? where productId=?";
        Integer integer = jdbcUtil.executeUpdate(sql, inters[1], inters[0]);
        jdbcUtil.close();
        return integer;
    }

    @Override
    public Integer selectCartById(Integer id) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        ResultSet resultSet = jdbcUtil.executeQuery("select number from cart where productId=?", id);
        Integer number = null;
        try {
            if (resultSet.next()) {
                number = resultSet.getInt("number");
            }
            return number;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        jdbcUtil.close();
        return number;
    }
}
