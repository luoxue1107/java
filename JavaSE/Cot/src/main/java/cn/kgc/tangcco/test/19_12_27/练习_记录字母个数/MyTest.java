package My;

import java.util.*;

public class MyTest {
    public static void main ( String[] args ) {
        String str="sdjaodoiajpdoaodapodjaopdpoa13op2i9113u91841l3koa";
        Map<Character,Integer> map=new HashMap<> (  );

        for (int i=0;i<str.length ();i++){
           Character c =str.charAt ( i );
               if(!(map.containsKey ( c ))){
               map.put ( c, 1 );
           }else {
                    //int a=map.get ( c );
                   map.put (    c   ,  map.get ( c )+1   );
               }
        }
        for (Map.Entry<Character,Integer> m:map.entrySet ()){
            System.out.println (m);
        }
    }
}