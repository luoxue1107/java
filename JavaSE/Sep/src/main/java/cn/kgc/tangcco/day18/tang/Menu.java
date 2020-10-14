package cn.kgc.tangcco.day18.tang;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/18 11:16
 */
public class Menu {
    private static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
            view();
            view2();

    }

    public static void view() {
        System.out.println("欢迎访问唐城物品租赁系统\n" +
                "目前只提供笔记本和U盘两种物品租赁服务，租金计算方式:\n" +
                " 归还物品时，按实际租用的天数计算租金\n" +
                ">>>笔记本共有四类:\n" +
                "联想13.9英寸超轻薄翻转笔记本,每日租金10元\n" +
                "小米15.6英寸金属轻薄笔记本,每日租金8.8元\n" +
                " 惠普小欧14英寸笔记本,每日租金5元\n" +
                "其他型号笔记本,每日租金4元\n" +
                ">>>U盘根据大小计算每日租金\n" +
                "容量1T,每日租金1，48元\n" +
                "容量512G,每日租金1元\n" +
                "容量156G,每日租金0.88元\n" +
                "容量低于256G,每日租金0.5元\n" +
                "更多物品租赁服务，敬请期待》》》"
        );
    }
    public static void view2(){
        System.out.print("系统功能表\n"+
                "1、查看所有物品\n" +
                "2、查看物品租用情况\n" +
                "3、出租物品\n" +
                "4、归还物品\n"+
                "0、退出系统\n"+
                "请选择>>>");
        switch (input.nextInt()){
            case 1:{
                show1();
                view2();
                break;
            } case 2:{
                show2();
                view2();
                break;
            } case 3:{
                rent();
                view2();
                break;
            } case 4:{
                giveBack();
                view2();
                break;
            } case 0:{
                System.out.println("关机");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("异常");
            }
        }
    }
    public static void show1(){
        RentManager.getInstance().show();

    }
    public static void show2(){
        RentManager.getInstance().showRentDevices();

    }
    public static void rent(){
       show1();
        System.out.print("请输入需要租赁的物品序号:");
        int index = input.nextInt();
        System.out.print("请输入租用人的学号:");
        String id = input.next();
        System.out.println(RentManager.getInstance().rent(index,id));

    }
    public static void  giveBack(){
     show2();
        System.out.print("请输入需要归还的物品序号:");
        int nextInt = input.nextInt();
        System.out.print("请输入总共的租赁天数:");
        int nextInt1 = input.nextInt();
        RentManager.getInstance().giveBack(nextInt,nextInt1);
    }


}
