package cn.kgc.dao;

import cn.kgc.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/28 17:45
 */
@Repository
public class ProductDaoImpl2 implements ProductDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Product selectProductById(Integer id) {
        Map<String, Object> map = jdbcTemplate.queryForMap("select * from `product` where `productId`=?", id);
        return new Product(Integer.parseInt(map.get("productId").toString()),String.valueOf(map.get("productName")),Double.valueOf(map.get("price").toString()));
    }

    @Override
    public List<Product> selectProductAll() {
        return null;
    }
}
