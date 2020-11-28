package cn.kgc.dao;

import cn.kgc.pojo.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/27 19:49
 */
@Repository
public class ProductDaoImpl implements ProductDao{
    private final JdbcTemplate jdbcTemplate;

    public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Product selectProductById(Integer id) {
        return null;
    }

    @Override
    public List<Product> selectProductAll() {
        String sql="select * from `product`";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        List<Product> products= new ArrayList<>();

        for (Map<String, Object> map:maps) {
            System.out.println(map.get("productId")+""+map.get("productName")+""+map.get("price"));
            products.add(new Product(Integer.parseInt(map.get("productId").toString()),String.valueOf(map.get("productName")),Double.valueOf(map.get("price").toString()))) ;
        }
       return products;
    }



}
