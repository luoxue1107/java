package cn.kgc.service;

import cn.kgc.dao.CartDao;
import org.springframework.stereotype.Service;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/28 22:13
 */
@Service
public class CartServiceImpl implements CartService{

    private final CartDao cartDao;

    public CartServiceImpl(CartDao cartDao) {
        this.cartDao = cartDao;
    }

    @Override
    public Integer setCartNumber(Integer[] integers) {
        return cartDao.updateCartNumber(integers);
    }

    @Override
    public Integer getCartNumber(Integer integer) {
        return null;
    }
}
