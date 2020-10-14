package cn.kgc.tangcco.day09.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description 菜品单
 * @date 2020/9/9 21:01
 */
@Getter
@Setter
public class Menu {
    /**
     * 菜名
     */
    private   String dishName;
    /**
     * 菜品单价
     */
     private  double price;

    /**
     * 点赞数
     */
    private   int praise;

}
