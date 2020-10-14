package cn.kgc.tangcco.day09.bean;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description 订单信息
 * @date 2020/9/9 20:02
 */
@Getter
@Setter
@NoArgsConstructor
public class OrderForm {
    /**
     * 序号
     */
    private int count;
    /**
     * 订餐人名
     */
    private String name;
    /**
     * 送餐时间
     * 要求用户输入10~20的整数
     */
    private int date;
    /**
     * 送餐地址
     */
    private  String site;
    /**
     * 状态
     * 两种状态：0：已预定（默认状态） 1、已完成（订单已签收）
     */
    private  int condition =0;
    /**
     *菜品份数
     */
    private  double copies;
    /**
     * 菜名序号
     */
    private  int caiCount;
    /**
     * 总金额 菜品单价*份数-送餐费
     */
    private double money;

    public OrderForm(String name, int date, String site, int condition, double copies, int caiCount, double money) {
        this.name = name;
        this.date = date;
        this.site = site;
        this.condition = condition;
        this.copies = copies;
        this.caiCount = caiCount;
        this.money = money;
    }
}
