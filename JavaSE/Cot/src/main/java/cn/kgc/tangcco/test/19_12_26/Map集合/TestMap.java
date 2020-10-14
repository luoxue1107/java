package My;

import java.util.*;

public class TestMap {
    public static void main ( String[] args ) {
        System.out.println ( THashMap.map.get ( "b" ) );
        //全部 键
        Set<String> k = THashMap.map.keySet ();
        System.out.println ( k );
        print ( k );
        //全部 值
        Collection<String> v = THashMap.map.values ();
        System.out.println ( v );
        print ( v );
        //全部的 键 与 值
        Set<Map.Entry<String,String>> entryS = THashMap.map.entrySet ();
        System.out.println (entryS);
        for  (Map.Entry<String,String> e:entryS){
            System.out.println (e.getKey ()+"\\"+e.getValue ());
        }

    }
    public static void print( Collection<String> v){
        for (String a:v){
            System.out.println (a);
        }
    }
}
class THashMap{
    public static HashMap<String,String> map=new HashMap<> (  );
    static {
        map.put (  "a","A");
        map.put (  "b","B");
        map.put (  "c","C");
        map.put (  "d","D");
        map.put (  "e","E");
        map.put (  null,null);
        map.put (  "f",null);
    }
}
