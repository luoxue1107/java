package cn.kgc.tangcco.day09.dao;

import cn.kgc.tangcco.day09.bean.OrderForm;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/9 8:43
 */
public interface FunctionDao {
    /**
     * 订餐
     * @param of 订单对象
     */
   void reserve(OrderForm of);
    /**
     * 查看订单
     */
    void check();

    /**
     *   签收定单
     * @param count 序号
     */
    void signFor(int count);
    /**
     * 删除定单
     */
    void delete1(int count);
    /**
     * 我要点赞
     */
    void praise();
    /**
     * 退出
     */
    void exit();
}
