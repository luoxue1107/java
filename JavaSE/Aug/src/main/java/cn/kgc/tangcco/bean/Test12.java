package cn.kgc.tangcco.Test.bean;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/24 12:14
 */
public class Test12 {
    public static int test(int a , int b) throws Exception{
       return  a/b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(test(1,0));
    }
}
