package cn.kgc.service;

import cn.kgc.dao.ProductDao;
import cn.kgc.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/28 22:13
 */
@Service
public class ProductServiceImpl  implements ProductService{
    @Autowired
    private ProductDao productDao;
    @Override
    public Integer addProduct(Product product) {
        return null;
    }

    @Override
    public Integer setProduct(Product product) {
        return null;
    }

    @Override
    public Integer deleteProduct(Integer id) {
        return null;
    }

    @Override
    public Integer deleteProductAll(Integer[] integers) {
        return null;
    }

    @Override
    public List<Product> getDoctor(Integer id) {
        return productDao.selectDoctor(id);
    }

    @Override
    public Product getProductById(Integer id) {
        return productDao.selectProductById(id);
    }

    @Override
    public Double getDoctorTotalPrice() {
        return productDao.selectDoctorTotalPrice();
    }
}
