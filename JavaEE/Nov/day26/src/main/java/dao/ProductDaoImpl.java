package dao;

import pojo.Product;
import util.JDBCUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 9:21
 */
public class ProductDaoImpl implements ProductDao {
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
        JDBCUtil jdbc = new JDBCUtil();
        String sql = "delete from product where productId=?";
        Integer[] integer = new Integer[integers.length];
        for (int i = 0; i < integers.length; i++) {
            integer[i] = jdbc.executeUpdate(sql, integers[i]);
        }
        jdbc.close();
        return integer;
    }

    @Override
    public List<Product> selectDoctor(Integer id) {
        JDBCUtil jdbc = new JDBCUtil();
        List<Product> list = new ArrayList<Product>();
        String sql = "select p.productId `id`,p.productName `name`,p.price price,c.number `number`,c.itemId `cid`, (number*price) as `count` from product p inner JOIN cart c WHERE c.productId=p.productId ";
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
        ResultSet resultSet = jdbc.executeQuery(sql);
        try {
            while (resultSet.next()) {
                list.add(new Product(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("number"),
                        resultSet.getDouble("count"),
                        resultSet.getInt("cid")
                ));
            }
            return list;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        jdbc.close();
        return list;
    }

    @Override
    public Product selectProductById(Integer id) {
        JDBCUtil jdbc = new JDBCUtil();
        String sql = "select p.productId `id`,p.productName `name`,c.number `number`,c.itemId `cid`  from product p inner JOIN cart c WHERE c.productId=p.productId and p.productId=?";
        ResultSet resultSet = jdbc.executeQuery(sql, id);
        Product product = new Product();
        try {
            if (resultSet.next()) {
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setNumber(resultSet.getInt("number"));
                product.setCid(resultSet.getInt("cid"));
            }
            return product;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        jdbc.close();
        return product;
    }

    @Override
    public Double selectDoctorTotalPrice() {
        JDBCUtil jdbc = new JDBCUtil();
        Double d = null;
        String sql = "SELECT SUM(s.count) as `sum` from (select p.productId `id`,p.productName `name`,p.price price,c.number `number`,c.itemId `cid`, (number*price) `count` from product p inner JOIN cart c WHERE c.productId=p.productId) as s";
        ResultSet resultSet = jdbc.executeQuery(sql);
        try {
            if (resultSet.next()) {
                d = resultSet.getDouble("sum");
            }
            return d;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        jdbc.close();
        return d;
    }
}
