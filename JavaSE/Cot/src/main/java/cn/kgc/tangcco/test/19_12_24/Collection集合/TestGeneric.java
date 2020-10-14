package My;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestGeneric {
    public static void main ( String[] args ) {
        //占位符 <类型>
        LinkedList<Double>list=new LinkedList<> (  );
        list.add ( 1553.1 );
        ArrayList<Integer>integers=new ArrayList<> (  );
        integers.add ( 155 );
        LinkedList<Character>characters=new LinkedList<> (  );
        characters.add ( 'a' );
        //-----------------------------------
        //对象类的泛型 在new对象的时候加类型
        MyClass<Integer> myClass=new MyClass<> ();
        myClass.m1 ( 1245 );
        MyClass2<Byte> myClass2= new MyClass2<>();
        myClass2.m2 ( 154.1);
        //-------------------------------------
        //静态泛型
        MyClass.m3 ( new Dug() );
    }
}
class MyClass<T>{

    public static <N extends A1 & Comparable>void m3(N n ){
    }
    public void m1(T t){
    }
}

abstract class A1{

}
class Dug extends A1 implements Comparable<Dug>{
    @Override
    public int compareTo ( Dug o ) {
        return 0;
    }
}
class Cat extends A1{}
interface MyInterface<B>{
    void m2( B b);
}
//接口的泛型 类型可以在实现类的后面
class MyClass2<I extends Number> implements MyInterface<Double>{
    @Override
    public void m2 ( Double b ) {

    }
}