package My;

import java.util.*;

public class MyTest {
    public static void main ( String[] args ) {
        //查看存储属性
        System.out.println (zu.map.entrySet ());
        Scanner input=new Scanner (System.in );
        String str=input.next ();
        //查看键下的值
        System.out.println (zu.map.get(str));
        print ( str );

    }
    private static void print(String str){
        Set<Map.Entry<String,String>> e=zu.map.entrySet ();
        boolean f=true;
        for (Map.Entry<String,String> a:e){
            if (str.equals ( a.getValue () )){
                f=false;
                System.out.println (a.getKey ());
            }
        }//第一种方法 判断
        if(zu.map.containsValue ( str )){
            System.out.println ("查不到");
        }
        //第二种方法 判断是否 找到
        if (f){ System.out.println ("查不到"); }
    }
}
class zu{
    public static  Map<String,String > map=new HashMap<> (  );
    static{
        map.put ( "2006","意大利" );
        map.put ( "2002","巴西" );
        map.put ( "1998","法国" );
        map.put ( "1994","巴西" );
        map.put ( "1990","德国" );
        map.put ( "1986","阿根廷" );
        map.put ( "1982","意大利" );
        map.put ( "1978","阿根廷" );
        map.put ( "1974","德国" );
        map.put ( "1970","巴西" );
        map.put ( "1966","英格兰" );
        map.put ( "1962","巴西" );
        map.put ( "1958","巴西" );
        map.put ( "1954","德国" );
        map.put ( "1950","乌拉圭" );
        map.put ( "1938","意大利" );
        map.put ( "1934","意大利" );
        map.put ( "1930","乌拉圭" );
    }
}
