package cn.kgc.service;

import cn.kgc.dao.ProductDao;
import cn.kgc.pojo.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/27 20:01
 */
@Service
public class ProductServiceImpl implements ProductService{
    private final ProductDao productDap;

    public ProductServiceImpl(@Qualifier("productDaoImpl") ProductDao productDap) {
        this.productDap = productDap;
    }

    @Override
    public Product getProductById(Integer id) {
        return productDap.selectProductById(id);
    }
    @Override
    public List<Product> getProducts() {
    return productDap.selectProductAll();
    }
}

