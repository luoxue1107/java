package My;

import java.util.*;
public class MyTest {
                                            //主方法不处理异常 虚拟机处理
    public static void main ( String[] args )throws Exception{
        System.out.println ( "main 开始" );
        try {
            m1 ( 2);
        } catch (Exception e) {
            System.out.println ( "异常提醒" );
        }
        System.out.println ( "main 结束" );

    }
    public static void m1(int n) throws Exception {
        System.out.println ( "m1开始" );
        m2 ( n );
        System.out.println ( "m1结束" );
    }
    public static void m2(int n) throws Exception {
        System.out.println ( "m2开始" );
        m3 ( n );
        System.out.println ( "m2结束" );
    }
    public static void m3(int n) throws Exception {//向上告知调用者 有异常
        System.out.println ( "m3开始" );
        if (n%2==0){
            throw new Exception ( "错误" );
        }
        System.out.println ( "m3结束" );
    }
}