package cn.kgc.tangcco.Test.bean;

import java.util.Arrays;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/19 14:42
 */
public class Test10 {
    public static void main(String[] args) {
        String str = new String("world");
        char[] ch = new char[]{'h','e','l','l','o'};
        method(str,ch);
        System.out.println(str);
        System.out.println(Arrays.toString(ch));
    }
    public static void method(String str, char[] arr){
        str = "change";
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
    }
}