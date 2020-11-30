package cn.kgc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/28 22:06
 */
@Repository
public class CartDaoImpl implements CartDao{
    private final JdbcTemplate jdbcTemplate;

    public CartDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Integer[] deleteCartById(Integer[] integers) {
        return new Integer[0];
    }

    @Override
    public Integer updateCartNumber(Integer[] inters) {
        String sql = "update cart set number=? where productId=?";
        return jdbcTemplate.update(sql, inters[1],inters[0]);
    }

    @Override
    public Integer selectCartById(Integer id) {
        return null;
    }
}
