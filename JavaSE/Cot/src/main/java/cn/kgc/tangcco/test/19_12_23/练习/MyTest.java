package My;

import java.util.*;

public class MyTest {
    public static void main ( String[] args ) {
       String s =UUID.randomUUID ().toString ();
        System.out.println (s);
        System.out.println (s.replace ("-" ,"" ));
        System.out.println (Math.random ());
        //随机数
        Random random=new Random (  );
        System.out.println (random.nextInt(10000));
        String sre="13154657879165798798789";
        int [] ints=new int[10];
        char[] chars=sre.toCharArray ();
        for (int i=0;i<chars.length;i++){
            System.out.println (chars[i]);
        }
        for (int i=0;i<10;i++){
            int g=0;
            for (int k=0;k<chars.length;k++){
                if (i==(chars[k]-48)){
                g++;
                }
            }
            ints[i]=g;
        }
        for (int i=0;i<ints.length;i++){
            System.out.println (i+"次数"+ints[i]);
        }
    }
}
