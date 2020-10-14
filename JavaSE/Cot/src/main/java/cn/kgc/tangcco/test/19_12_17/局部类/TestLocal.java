package My;

import javax.print.DocFlavor;

public class TestLocal {
    //局部类
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.m1();


    }
}
class Outer1{
    String  a ="外部类a";
    In in=null;
    public void m1(){
        /*
         因为方法循行完就自动清除
        而类的对象不会清除所以想要取外部类方法中的变量值
        需要把变量 改为常量 方法结束常量是不会跟着方法清除的
        */
         final  String a1="外部类方法a";

        class Inner implements In{//内部类也是可继承的
            String a="方法中的内部类a";
            public void m2(){
                String a="内部类方法a";
                System.out.println(a);
                System.out.println(this.a);
                System.out.println(Outer1.this.a);
                System.out.println(a1);
            }
        }
        Inner inner=new Inner();
        inner.m2();
        in=   new Inner();
        in.m2();
}
}

interface In{
   public abstract void m2();
}