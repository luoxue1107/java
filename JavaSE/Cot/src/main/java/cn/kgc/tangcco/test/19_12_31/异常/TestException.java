package My;

import java.io.IOException;

public class TestException {
    public static void main ( String[] args )  {
        Super s=new Sup();
        try {
            s.m1 ();
        } catch (Exception e) {
            System.out.println ("m1 Exception");
        }

        Interface i=new MyC ();
        try {
            i.m1 ();
        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}
class Super{
    public void m1() throws AbstractMethodError, Exception {
        System.out.println ("super m1");
    }
}
class Sup extends Super{
    //子类的异常不可以比父类抛出的异常更宽泛
    public void m1() throws RuntimeException{
        System.out.println ("sup m1");
    }
}
interface Interface {
    void m1() throws IOException,Exception;
}
class MyC implements Interface{

    @Override
    //实现类的异常也不可 比接口跑车的异常更宽泛
    public void m1 ( ) throws RuntimeException {

    }
}