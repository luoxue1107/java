package cn.kgc.tangcco.day04.tang.dao;

import cn.kgc.tangcco.day04.tang.Commodity;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/4 15:13
 */
public interface FunctionDao{
    /**
     * 添加商品
     * @param c 添加对象
     * @return 返回是否添加成功
     */
    boolean add(Commodity c);

    /**
     * 查看全部商品
     */
    void  showAll();

    /**
     * 查看指定类别的商品
     * @param str 输入 类别
     */
    void  show(String str);

    /**
     *   添加购物车
     * @param str 商品名
     * @param ins 购买数量
     * @return 返回成功判断
     */
    boolean addShoppingTrolley(String str,int ins);

    /**
     * 显示购物车
     */
    void showShoppingTrolley();

    /**
     *  删除库存里的商品
     * @param str 商品名
     * @return 返回成功
     */
    /**
     *  删除库存里的商品
     * @param str 商品名
     * @param ins 删除个数
     * @return 返回是否成功
     */
    boolean deleteCommodity(String str,int ins);
    /**
     * 修改库存数量
     * @param str 商品名
     * @param ins 修改的数量
     * @return 返回是否成功
     */
    boolean setInventory(String str,int ins);



}
