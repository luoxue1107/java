package My;

import java.util.*;
public class MyTest {
    public static void main ( String[] args ) {
        //获取开始时间 毫秒为单位
        long s=System.currentTimeMillis ();
        System.err.println (s);
        for (int i=0;i<10000;i++){
            System.out.println ("hello");
        }
        long s1=System.currentTimeMillis ();
        //结束的时间减去初始时间等于程序运行的时间
        System.err.println (s1-s);
    }
}