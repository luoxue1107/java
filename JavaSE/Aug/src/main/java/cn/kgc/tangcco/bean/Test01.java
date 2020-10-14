package cn.kgc.tangcco.Test.bean;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/12 11:41
 */
public class Test01 {
//    public void Test1() {
//        for (int i = 0; i < 100 ; i++) {
//            int a=Test(i);
//            if (a==0){
//                System.out.println(i);
//            }
//       }
//    }
//    public int Test(int i){
//        return i&1;
//    }

    public static void main(String[] args) {
//        Test01 test01=new Test01();
//        test01.Test1();
//        for (int i = 0; i <100 ; i+=2) {
//            System.out.println(i);
//        }
//        String s1="abc";
//        String s2 ="a";
//        String s3="123";
//        System.out.println("123");
//        System.out.println(s1+s2+s3);
        Scanner input = new Scanner(System.in);
        System.out.println("输入（0.石头 1.尖刀 2.布）");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("石头");
        } else if (num == 1) {
            System.out.println("尖刀");
        } else if (num == 2) {
            System.out.println("布");
        } else {
            System.out.println("输入有误！ 请输入0 1 2");
        }
        int number = input.nextInt();

        if (number>=1000){
            System.out.println("输入的数>=1000");
        }else {
            System.out.println("输入的数<10");

        }
    }
}

