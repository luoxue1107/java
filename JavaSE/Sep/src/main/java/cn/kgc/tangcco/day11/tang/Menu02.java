package cn.kgc.tangcco.day11.tang;

import cn.kgc.tangcco.day11.tang.base.BaseBankCard;
import cn.kgc.tangcco.day11.tang.bean.MainCard;
import cn.kgc.tangcco.day11.tang.bean.ViceCard;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description 菜单二
 * @date 2020/9/11 11:46
 */
public class Menu02 {
    private Scanner input = new Scanner(System.in);
    private BaseBankCard card;

    public Menu02(BaseBankCard card) {
        this.card = card;
    }

    public void view() {
        if (card instanceof MainCard) {
            viewMain();
        } else if (card instanceof ViceCard) {
            viewVice();
        }
    }

    private void viewMain() {
        System.out.println("\t1.查询余额\n" +
                "\t2.存款\n" +
                "\t3.取款\n" +
                "\t4.转账\n" +
                "\t0.返回上一层\n" +
                "\t请输入您的选择:");
        int ins = input.nextInt();
        switch (ins) {
            case 0: {
                Menu01.view();
                break;
            }
            case 1: {
                checkBalance();
                viewMain();
                break;
            }
            case 2: {
                setMoney();
                viewMain();
                break;
            }
            case 3: {
                getMoney();
                viewMain();
                break;
            }
            case 4: {
                postMoney();
                viewMain();
                break;
            }
            default: {
                System.out.println("输入有误");
                viewMain();
                break;
            }
        }
    }

    private void viewVice() {
        System.out.println("\t1.查询余额\n" +
                "\t2.存款\n" +
                "\t3.取款\n" +
                "\t0.返回上一层\n" +
                "\t请输入您的选择:");
        int ins = input.nextInt();
        switch (ins) {
            case 0: {
                Menu01.view();
                break;
            }
            case 1: {
                checkBalance();
                viewVice();
                break;
            }
            case 2: {
                setMoney();
                viewVice();
                break;
            }
            case 3: {
                getMoney();
                viewVice();
                break;
            }
            default: {
                System.out.println("输入有误");
                viewVice();
                break;
            }
        }
    }

    private void checkBalance() {
        System.out.println("===查询余额===");
     if (card instanceof  MainCard){
         card.checkBalance();
     }else  if (card instanceof ViceCard){
         card.checkBalance();
     }
    }

    private void setMoney() {
        System.out.print("===存款===");
        System.out.print("请输入您的存款金额:");
        double v = input.nextDouble();
        if (card instanceof  MainCard){
            if(card.setMoney(v)){
                System.out.println("取款成功，您的账号余额为:"+card.getBalance()+"元");
            }
        }else  if (card instanceof ViceCard){
            if(card.setMoney(v)){
                System.out.println("取款成功，您的账号余额为:"+card.getBalance()+"元");
            }
        }
    }


    private void getMoney() {
        System.out.println("===取款===");
        System.out.print("请输入您的存款金额:");
        double v = input.nextDouble();
        if (card instanceof  MainCard){
            if (card.getMoney(v)){
                System.out.println("取款成功，您的账号余额为:"+card.getBalance()+"元");
            }else {
                System.out.println("取款失败");
            }
        }else  if (card instanceof ViceCard){
            if (card.getMoney(v+2)){
                System.out.println("取款成功，您的账号余额为:"+card.getBalance()+"元");
            }else {
                System.out.println("取款失败");
            }
        }
    }

    private void postMoney() {
        System.out.println("===转账===");
        if (card instanceof  MainCard){
            System.out.print("请输入对方账号:");
            String next = input.next();
            System.out.print("请输入您的转账金额:");
            double v = input.nextDouble();
            if (((MainCard) card).postMoney(next,v)) {
                System.out.println("转账成功，您的账号余额为:"+card.getBalance()+"元");
            }else {
                System.out.println("转账失败");
            }
        }
    }

}