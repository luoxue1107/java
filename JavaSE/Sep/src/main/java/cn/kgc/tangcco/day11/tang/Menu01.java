package cn.kgc.tangcco.day11.tang;

import cn.kgc.tangcco.day11.tang.bean.MainCard;
import cn.kgc.tangcco.day11.tang.bean.ViceCard;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description 菜单一
 * @date 2020/9/11 9:01
 */
public class Menu01 {
    private static Scanner input = new Scanner(System.in);

    //    显示所有银行卡信息
//     添加银行卡信息
//    删除银行卡信息
//    登录某张银行卡（选做功能）
//    登录成功后，二级菜单内容包括查询余额、存款、取款。其中，银行卡分为本行卡和非本行卡，非本行卡每次取款需要收取2元手续费，
//    本行卡取款不收取手续费。本行卡可以转账。需要使用继承和多态方式实现。
    public static void view() {
        System.out.print("=============唐城自助银行系统=============\n" +
                "\t1.显示所有银行卡信息\n" +
                "\t2.开户\n" +
                "\t3.销卡\n" +
                "\t4.插卡\n" +
                "\t0.退出\n" +
                "\t请输入您的选择:");
        int ins = input.nextInt();
        switch (ins) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                System.out.println("---所有银行卡信息如下---");
                Card.getInstance().check();
                view();
                break;
            }
            case 2: {
                activate();
                view();
                break;
            }
            case 3: {
                delete();
                view();
                break;
            }
            case 4: {
                entrance();
                break;
            }
            default: {
                System.out.println("输入有误");
                view();
                break;
            }
        }
    }

    private static String random() {
        String str = "622262";
        return str + RandomStringUtils.randomNumeric(13);
    }

    private static void activate() {
        System.out.println("---添加一张银行卡---");
        System.out.print("是否是本银行卡？y/n");
        char c = input.next().charAt(0);
        if (c == 'y') {
            System.out.println("输入您的姓名:");
            String name = input.next();
            System.out.println("输入您的密码:");
            int pwd = input.nextInt();
            System.out.println("开户金额:");
            double v = input.nextDouble();
            if (Card.getInstance().activate(new MainCard(random(), pwd, name, v))) {
                System.out.println("添加加银行卡完成");
            } else {
                System.out.println("添加加银行卡失败");
            }
        } else if (c == 'n') {
            System.out.print("输入您的姓名:");
            String name = input.next();
            System.out.print("输入您的密码:");
            int pwd = input.nextInt();
            System.out.print("开户金额:");
            double v = input.nextDouble();
            if (Card.getInstance().activate(new ViceCard(random(), pwd, name, v))) {
                System.out.println("添加加银行卡完成");
            } else {
                System.out.println("添加加银行卡失败");
            }
        } else {
            System.out.println("输入有误");
            activate();
        }
    }


    private static void delete() {
        System.out.print("输入您的卡号:");
        String id = input.next();
        System.out.print("输入您的密码:");
        int pwd = input.nextInt();
        if (Card.getInstance().delete(id, pwd)) {
            System.out.println("注销成功");
        } else {
            System.out.println("注销失败");
        }

    }

    private static void entrance() {
        System.out.print("输入您的卡号:");
        String id = input.next();
        System.out.print("输入您的密码:");
        int pwd = input.nextInt();
        if (Card.getInstance().entrance(id, pwd)) {
            System.out.println("=====================欢迎"+Card.getInstance().cardMap.get(id).getName()+"=====================");
            Menu02  menu02=new Menu02(Card.getInstance().cardMap.get(id));
            menu02.view();
        } else {
            System.out.println("登录失败");
        }
    }
}
