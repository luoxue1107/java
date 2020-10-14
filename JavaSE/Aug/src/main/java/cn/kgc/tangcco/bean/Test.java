package cn.kgc.tangcco.bean;

import java.util.Scanner;

/**
 * 练习
 */
public class Test {
    static  String[] liHaoZhe ={"1","admin","123456","李浩哲", "1", "36", "吉林省", "15311484568", "646269678"};
    public static void main(String[] args){
        login();

    }

    /**
     *登录界面
     */
    static  void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("输入账号:");
        String account = input.next();
        System.out.print("输入密码:");
        String password = input.next();
        loginCheck(account,password);
    }

    /**
     * 判断account 和 password
     * @param account  admin
     * @param password 123456
     */
    static void  loginCheck(String account,String password){
        if (account.equals(liHaoZhe[1]) && password.equals(liHaoZhe[2])){
            //调用函数
            userInfo();
        }else{
            System.out.println("对不起 您密码或账号不正确！");
        }
    }

    /**
     * name 打印
     * address 打印
     */
    static void userInfo(){
        System.out.println("name:\t"+liHaoZhe[3]);
        System.out.println("address:\t"+liHaoZhe[6]);
    }

}

