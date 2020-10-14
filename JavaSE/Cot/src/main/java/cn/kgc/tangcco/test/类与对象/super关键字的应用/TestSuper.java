//super在构造方法的应用
public class TestSuper {
    public static void main(String[] args) {
        C c=new C(10,20,30);
        System.out.println(c.Aa);
        System.out.println(c.Bb);
        System.out.println(c.Cc);
        D d=new D(10);
        System.out.println(d.Dd);
    }
}
class A{
    //2.运行属性
    int Aa;
    public A(){
        super();//1.运行默认 如果没有父类 默认的父类是object的一个对象类
        //3.运行构造方法里的代码
        System.out.println("A的无参构造方法");
        //都运行完成后回到子类
    }
    public A(int vA){
        Aa=vA;
    }
}
class B extends A{
    //2.运行属性
    int Bb;
    public B(){
        super();//1.运行 默认 B的父类无参构造方法
      //3.运行构造方法里的代码
        System.out.println("B的无参构造方法");
        //都运行完成后回到子类
    }
    public B(int vA,int vB){
        super(vA);
        Bb=vB;
    }

}
class C extends B{
    //2.运行属性
    int Cc;
    public C (){
        super();//1.运行默认 C的父类无参构造方法
        //3.运行构造方法里的代码
        System.out.println("C的无参构造方法");
    }
    public C(int vA,int vB ,int vC){

        super(vA,vB);
        Cc=vC;
    }
}
class D extends C{
    int Dd;
    public D(int vD){
        //有参构造方法中如果不写父类构造方法 那么父类的构造方法默认还是 无参构造super()；
        Dd=vD;
    }

}

