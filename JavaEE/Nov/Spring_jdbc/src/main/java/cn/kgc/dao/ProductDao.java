package cn.kgc.dao;

import cn.kgc.pojo.Product;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/27 19:44
 */
public interface ProductDao {
    List<Product> selectProductAll();
    Product selectProductById(Integer id);

}
