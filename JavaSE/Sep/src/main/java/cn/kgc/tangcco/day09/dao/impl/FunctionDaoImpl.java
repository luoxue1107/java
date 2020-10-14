package cn.kgc.tangcco.day09.dao.impl;


import cn.kgc.tangcco.day09.bean.Menu;
import cn.kgc.tangcco.day09.bean.OrderForm;
import cn.kgc.tangcco.day09.dao.FunctionDao;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/9 8:44
 */
public class FunctionDaoImpl implements FunctionDao {
    private static FunctionDaoImpl instance = new FunctionDaoImpl();

    public static FunctionDaoImpl getInstance() {
        return instance;

    }

    static int count = 1;

    private FunctionDaoImpl() {
    }

    /**
     * 订单信息储存
     */
    ArrayList<OrderForm> orderForms = new ArrayList<>();
    /**
     * 菜品储存
     */
    Map<Integer, Menu> menus = new HashMap<>();


    /**
     * 订餐
     */
    @Override
    public void reserve(OrderForm of) {
        if (null != of) {
            of.setCount(count);
            orderForms.add(of);
            count++;
        }
    }

    /**
     * 查看订单
     */
    @Override
    public void check() {
        if (orderForms!=null){
            for (OrderForm f : orderForms) {
                System.out.println("序号\t订餐人姓名\t订餐信息\t送餐时间\t送餐地址\t总金额\t状态");
                System.out.println(f.getCount() +
                        "\t:" + f.getName() +
                        "\t:" + menus.get(f.getCaiCount()).getDishName() +
                        "\t" + f.getDate() + "时" +
                        "\t" + f.getSite() +
                        "\t" + f.getMoney() + " " +
                        "\t" + (f.getCondition() == 0 ? "已预订" : "已完成"));
            }
        }else {
            System.out.println("没有订单");
        }
    }

    /**
     * 签收定单
     */
    @Override
    public void signFor(int count) {
        if (orderForms!=null){
            for (OrderForm f: orderForms) {
                if (f.getCount()==count){
                    f.setCount(1);
                    }else {
                    System.out.println("找不到");
                }
            }
        }
    }

    /**
     * 删除定单
     */
    @Override
    public void delete1(int count) {
        if (orderForms!=null){
            for (OrderForm f:orderForms) {
                if (f.getCount()==count){
                    orderForms.remove(f);



                }else {
                    System.out.println("找不到");
                }
            }
        }else {
            System.out.println("空");
        }
    }

    /**
     * 我要点赞
     */
    @Override
    public void praise() {
    }

    /**
     * 退出系统
     */
    @Override
    public void exit() {

    }
}
