package cn.kgc.tangcco.Test.bean;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/13 16:55
 */
public class Test04 {
    //能被4整除而不能被100整除 能被400整除 365 12  1 3 5 7 8 10 12 31
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year=input.nextInt();

        if (year%4==0 && year%100!=0){
            for (int i = 1; i <=12; i++) {
                if (i == 1||i==3||i==5||i==7||i==8||i==10||i==12){
                    
                }
            }
        }

    }
}
