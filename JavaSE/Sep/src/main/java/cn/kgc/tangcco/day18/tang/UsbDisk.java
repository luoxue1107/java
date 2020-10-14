package cn.kgc.tangcco.day18.tang;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description U盘
 * @date 2020/9/18 9:26
 */
@Setter
@Getter
public class UsbDisk extends Device{
    private String type;
    private double money;
    @Override
    public double calcRent(int days) {
        if (days>0){
            return ((double)days)*money;
        }
        return -1;
    }

    public UsbDisk() {
    }

    public UsbDisk(Integer inTotal, Integer residue, String type, double money) {
        super(inTotal, residue);
        this.type = type;
        this.money = money;
    }

    @Override
    public void showInfo() {
        System.out.println("U盘,类型:"+type+",总数量:"+super.getInTotal()+",目前剩余数量:"+super.getResidue());
    }
}
