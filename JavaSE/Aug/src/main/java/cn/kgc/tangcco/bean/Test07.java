package cn.kgc.tangcco.Test.bean;

import java.util.*;

/**
 * @author 李庆华
 * @Description 字符串转数字
 * @date 2020/8/14 9:53
 */
public class Test07 {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("输入：");
        print(test(input.next()));
//        System.out.println(test(test("我是你爸爸")));
//        print(test("我是你爸爸"));
//        print(test(test("我是你爸爸")));

    }

    /**
     * 整数转字符
     *
     * @param a int a
     * @return char 字符
     */
    static char test(int a) {
        return (char) a;
    }

    /**
     * 输入一个字符串打印一个 int数组
     *
     * @param a 字符串
     * @return int数组
     */
    static int[] test(String a) {
        int[] num = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            num[i] = a.charAt(i);
        }
        return num;
    }

    /**
     * 把一个int数组 转 char数组
     *
     * @param a int数组
     * @return char数组
     */
    static char[] test(int[] a) {
        char[] chars = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            chars[i] = (char) a[i];
        }
        return chars;
    }

    /**
     * 打印一个int数组
     *
     * @param a
     */
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 打印一个char数组
     *
     * @param a char数组
     */
    static void print(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
    }

}
