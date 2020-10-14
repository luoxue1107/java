package My;

public class TestMember {
    public static void main(String[] args) {
        //创建外部类对象
        Outer outer=new Outer();
        outer.m1();
        //外部类对象引导到 内部部类 再new 内部类
        Outer.Inner inner=outer.new Inner();
        System.out.println(inner.a);
        inner.m2();
        System.out.println("______________________________");
        System.out.println( Static.Inner.a);//静态类的方法和属性可以直接一类名.方式写入；
        Static.Inner.m2();
        Static s=new Static();
        s.m1();



    }
}
class Outer{
    private String  a="外部类a";
    public void m1(){
        String  a="外都方法a";
        System.out.println("外部m1\t"+a);//方法的a
        System.out.println("外部m1\t"+this.a);//外部类的a
        Inner inner=new Inner();
        System.out.println("外部m1\t"+ inner.a);//内部类的a

    }
    class Inner{
        String a="内部类a";
        public void m2(){
            String  a ="内部方法a";
            System.out.println("内部m2\t"+a);//方法内的a
            System.out.println("内部m2\t"+this.a);//内部类的a
            System.out.println("内部m2\t"+Outer.this.a);//外部类的a
        }
    }
}
class Static{
    String  a="外部a";
    static String A="静态外部A";
    public void m1(){
        System.out.println("外部m1"+a);
        System.out.println("外部m1"+A);
    }
     static class Inner{
        static String a="静态内部a";
        public  static void m2(){
            System.out.println("内部静态m2"+a);
            System.out.println("内部静态m2"+A);
            Static s=new Static();
            System.out.println("内部静态m2"+s.a);
        }
    }
}