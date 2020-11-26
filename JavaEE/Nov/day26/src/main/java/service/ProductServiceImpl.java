package service;

import dao.CartDaoImpl;
import dao.ProductDaoImpl;
import pojo.Product;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 10:03
 */
public class ProductServiceImpl implements ProductService {
    private ProductDaoImpl productDao =new ProductDaoImpl();
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
    public List<Product> getDoctor(Integer id) {
        return  productDao.selectDoctor(id);
    }
    @Override
    public Product getProductById(Integer id) {
        return productDao.selectProductById(id);
    }

    @Override
    public Double getDoctorTotalPrice() {
        return productDao.selectDoctorTotalPrice();
    }

    @Override
    public Integer deleteProductAll(Integer[] integers) {
        CartDaoImpl cartDaoImpl =new CartDaoImpl();
        Integer[] integers1 = cartDaoImpl.deleteCartById(integers);
        Integer[] integers2 = productDao.deleteProductAll(integers);
        Integer ins=1;
        for (Integer integer : integers1) {
            if (integer < 0) {
                return 0;
            }
        }
        for (int j = 0; j < integers2.length; j++) {

            if (integers1[j] < 0) {
                return 0;
            }
        }
        return ins;
    }

    @Override
    public Integer setCartNumber(Integer[] integers) {
        CartDaoImpl cartDao =new CartDaoImpl();
        return cartDao.updateCart(integers);
    }

    @Override
    public Integer getCartNumber(Integer integer) {
        CartDaoImpl cartDaoImpl =new CartDaoImpl();
        return cartDaoImpl.selectCartById(integer);
    }
}
