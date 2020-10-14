package cn.kgc.tangcco.day04.tang;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/4 15:15
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Commodity {
    /**
     * 名称
     */
    private  String name;
    /**
     * 类别
     */
    private  String category;
    /**
     * 品牌
     */
    private  String brand;
    /**
     * 价格
     */
    private  double price;
    /**
     * 库存
     */
    private  int  inventory;

    @Override
    public String toString() {
        return "商品名称:" +name +
                "\n商品类型:" + category +
                "\n商品品牌:" + brand +
                "\n商品价格:" + price +
                "\n商品库存:" + inventory+"\n";
    }
}
