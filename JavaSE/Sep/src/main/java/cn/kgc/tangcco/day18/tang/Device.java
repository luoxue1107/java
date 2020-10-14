package cn.kgc.tangcco.day18.tang;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/18 9:20
 */
@Getter
@Setter
public abstract class Device {
    /**
     * 总数量
     */
   private int inTotal;
    /**
     * 剩余数量
     */
   private int  residue;

    /**
     *计算租金方法
     * @param days 租用的天数
     * @return 返回钱
     */
    public abstract double calcRent(int days);

    /**
     *显示信息方法
     */
    public abstract void showInfo();

    public Device() {
    }

    public Device(Integer inTotal, Integer residue) {
        this.inTotal = inTotal;
        this.residue = residue;
    }
}
