package cn.kgc.service;

import cn.kgc.entity.*;
import java.util.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 10:01
 */
public interface ProductService {
    Integer addProduct(Product product);
    Integer setProduct(Product product);
    Integer deleteProduct(Integer id);
    Integer deleteProductAll(Integer[] integers);
    List<Product> getDoctor(Integer id );
    Product getProductById(Integer id);
    Double getDoctorTotalPrice();
}
