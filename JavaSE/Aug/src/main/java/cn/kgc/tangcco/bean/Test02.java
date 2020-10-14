package cn.kgc.tangcco.Test.bean;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/12 16:24
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入: 1.面包 2.可乐 3.薯片 4.火腿");
        int num = input.nextInt();
       if (num == 1) {
           System.out.println("购买面包");
       }else if (num == 2){
            System.out.println("购买可乐");
        }else if (num == 3){
            System.out.println("购买薯片");
        }else if (num == 4){
            System.out.println("购买火腿");
        }else {
           System.out.println("输入有误！！请输入序号（1 2 3 4）");
       }
    }
}
