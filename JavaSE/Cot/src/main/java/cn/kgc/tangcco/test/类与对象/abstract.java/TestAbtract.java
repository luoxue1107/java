public class TestAbstract {
    //抽象
    public static void main(String[] args){
    //抽象父类是无法直接new对象的需要new父类类型 子类对象来实现
        av a=new bv();
        System.out.println(a.A);
        System.out.println(a.B);
        a.a();
    }
}
//抽象父类
abstract class av{
    int A=20;
    int B=30;
    //抽象方法 如果父类是抽象方法 子类必须覆盖此方法
public abstract void a();
}
//子类
class bv extends av{
public void a(){
    System.out.println("子类方法a");
}
}