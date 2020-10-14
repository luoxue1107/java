package cn.kgc.tangcco.day04.tang;

import cn.kgc.tangcco.day04.tang.dao.impl.FunctionDaoImpl;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/4 15:53
 */
public class Menus {
    private Scanner input = new Scanner(System.in);

    public void view() {
        try {
            System.out.println("=====================欢迎进入京东商城=====================\n" +
                    "\t1.添加商品\n" +
                    "\t2.查看所有商品\n" +
                    "\t3.查看指定类别的商品\n" +
                    "\t4.添加到购物车\n" +
                    "\t5.显示购物车\n" +
                    "\t6.删除商品\n" +
                    "\t7.修改商品中的库存\n" +
                    "\t0.退出\n" +
                    "=======================================================");
            System.out.print("请选择菜单：");
            int ins = 0;
            do {
                ins = input.nextInt();
            } while (ins < 0 || ins > 7);

            switch (ins) {
                case 0:{
                    System.out.print("是否保存订单 保存按“y”不保存按任意键");
                    char cha=input.next().charAt(0);
                    if (cha=='y'){
                        System.out.println("输入你的储存路径要用\'\\\\\'隔开:");
                        FunctionDaoImpl.getInstance().print(input.next());
                    }
                    System.out.println("关机中>>>\n");
                    System.exit(0);
                    break;
                }
                case 1: {
                    Menus02.getInstance().add();
                    break;
                }
                case 2: {
                    Menus02.getInstance().showAll();
                    break;
                }
                case 3: {
                    Menus02.getInstance().show();
                    break;
                }
                case 4: {
                    Menus02.getInstance(). addShoppingTrolley();
                    break;
                }
                case 5: {
                    Menus02.getInstance(). showShoppingTrolley();
                    break;
                }
                case 6: {
                    Menus02.getInstance(). deleteCommodity();
                    break;
                }
                case 7: {
                    Menus02.getInstance().setInventory();
                    break;
                }
                default: {
                    System.out.println("异常");
                }
            }
            view();

        }catch (Exception e){

        }
    }
}
