package My;

import java.util.*;
public class MyTest {

    public static void main ( String[] args ){
      int m=m1 ();
        System.out.println (m);
    }
    public static int m1(){
        int a=10;
        try{
            a=50;
            throw new RuntimeException (  );
        }catch (Exception e){
            a=30;
            return a;
        }finally {
            a=40;
        }
    }
}