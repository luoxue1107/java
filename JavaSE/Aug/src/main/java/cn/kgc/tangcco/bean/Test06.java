package cn.kgc.tangcco.Test.bean;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description 打印一个等腰三角形；
 * @date 2020/8/13 16:23
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入：");
        int num = input.nextInt();
        //等腰三角
        for (int i = 0; i <num; i++) {
            //倒三角
            for (int j = i; j < num+1; j++) {
                if (j == num){
                System.out.print("^");
                } else{System.out.print(" ");}
            }
            //正三角
            for (int j = 0; j <=(i*2)-1; j++) {
                System.out.print("^");
            }
            System.out.println("");
        }
    }
}
