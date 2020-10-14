package cn.kgc.tangcco.bean;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description 计算0到50之间的奇数和；
 * @date 2020/8/13 10:21
 */
public class Test03 {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        int count=0;
        System.out.println("输入：");
        int num = input.nextInt();
        System.out.println("输入：");
        int num1 = input.nextInt();
        for (int i = num; i <num1 ; i++) {
            if (i%2!=0){
                count+=i;
            }
        }
        System.out.println(num+"到"+num1+"的值为"+count);
    }
}
