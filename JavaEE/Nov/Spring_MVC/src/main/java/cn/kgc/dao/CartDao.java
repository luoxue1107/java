package cn.kgc.dao;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 11:25
 */
public interface CartDao {
    Integer[] deleteCartById(Integer[] integers);
    Integer updateCart(Integer[] inters);
    Integer selectCartById(Integer id);
}
