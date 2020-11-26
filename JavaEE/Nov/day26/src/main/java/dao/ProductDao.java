package dao;

import pojo.Product;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 9:11
 */
public interface ProductDao {
    Integer insertProduct(Product product);
    Integer updateProduct(Product product);
    Integer[] deleteProductAll(Integer[] integers);
    List<Product> selectDoctor(Integer id );
    Product selectProductById(Integer id);
    Double selectDoctorTotalPrice();
}
