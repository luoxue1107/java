package My;

import java.util.ArrayList;

public class TestList {
    public static void main ( String[] args ) {
        ArrayList arrayList=new ArrayList (20 );
        //添加
        arrayList.add ( "a" );
        arrayList.add ( "b" );
        arrayList.add ( "c" );
        arrayList.add ( 2,"2" );
        System.out.println (arrayList.get ( 0 ));
        System.out.println (arrayList.get ( 2 ));
       //清除
        arrayList.remove ( 0 );
        System.out.println (arrayList.get ( 0 ));
        //元素个数
        int s= arrayList.size ();
        for (int i=0;i<s;i++){
           System.out.print (arrayList.get ( i )+"\t");
        }
       Object[] listArray=arrayList.toArray ();
        for (int i= 0;i<listArray.length;i++) {
            System.out.println ( listArray.toString () );
            System.out.println (listArray[i]);
        }
        arrayList.clear ();
        System.out.println (arrayList.isEmpty ());
        System.out.println (arrayList.toString ());
    }
}
