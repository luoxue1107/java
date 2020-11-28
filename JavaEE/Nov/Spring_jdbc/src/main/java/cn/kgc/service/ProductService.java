package cn.kgc.service;

import cn.kgc.pojo.Product;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/27 20:00
 */
public interface ProductService {
    List<Product> getProducts();
    Product getProductById(Integer id);
}
