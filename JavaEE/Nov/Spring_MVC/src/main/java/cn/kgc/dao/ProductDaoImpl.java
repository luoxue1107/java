package cn.kgc.dao;

import cn.kgc.entity.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/28 22:07
 */
@Repository
public class ProductDaoImpl implements ProductDao {
    private final JdbcTemplate jdbcTemplate;

    public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Integer insertProduct(Product product) {
        return null;
    }

    @Override
    public Integer updateProduct(Product product) {
        return null;
    }

    @Override
    public Integer[] deleteProductAll(Integer[] integers) {
        return new Integer[0];
    }

    @Override
    public List<Product> selectDoctor(Integer id) {
        List<Product> list = new ArrayList<>();
        String sql = "select p.productId `id`,p.productName `name`,p.price price,c.number `number`,c.itemId `cid`, (number * price) as `count` from product p inner JOIN `cart` c WHERE c.productId=p.productId ";
        switch (id) {
            case 0: {
                sql += " ORDER BY `count` DESC";
                break;
            }
            case 1: {
                sql += " ORDER BY `count` ASC";
                break;
            }
            case 2: {
                sql += " ORDER BY `price` DESC";
                break;
            }
            case 3: {
                sql += " ORDER BY `price` ASC";
                break;
            }
            default: {
            }
        }
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : maps) {

            list.add(new Product(Integer.parseInt(map.get("id").toString()),
                    String.valueOf(map.get("name")),
                    Double.valueOf(map.get("price").toString()),
                    Integer.parseInt(map.get("number").toString()),
                    Double.valueOf(map.get("count").toString()),
                    Integer.parseInt(map.get("cid").toString())
            ));
        }
        return list;
    }

    @Override
    public Product selectProductById(Integer id) {
        String sql ="select c.productId pid,number,c.itemId cid,p.productName name  from product as p  join cart as c on p.productId = c.productId where c.itemId=?";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, id);
        Product product = new Product();
        product.setId(Integer.parseInt(map.get("pid").toString()));
        product.setName(map.get("name").toString());
        product.setNumber(Integer.parseInt(map.get("number").toString()));
        product.setCid(Integer.parseInt(map.get("cid").toString()));
        return product;
    }

    @Override
    public Double selectDoctorTotalPrice() {
        String sql = "SELECT SUM(number*price) as `sum` from product p inner JOIN cart c WHERE c.productId=p.productId";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql);
        return Double.valueOf(map.get("sum").toString());
    }
}
