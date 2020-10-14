public class TestStatic {
    //静态
    public static void main(String[] args) {
        new My();
        System.out.println("______________________________");
       new Father();
        System.out.println("_______________________________");
        new Son();
    }
}
class My{
    //第一步执行静态属性赋值
    static String  b="静态属性";
    //第三步实例属性赋值
    String a="实例属性";
    //第二步执行静态代码块
    static{
        System.out.println(b);
        System.out.println("静态代码");
    }
  //第四步执行实例代码块
    {
        System.out.println(a);
        System.out.println("动态代码");
    }

    public My(){
        //第五步执行构造方法中的代码
        System.out.println("构建方法");
    }
}
//父类类
class Father{

    static String  b="父类静态属性";

    String a="父类实例属性";

    static{
        System.out.println(b);
        System.out.println("父类静态代码");
    }
    {
        System.out.println(a);
        System.out.println("父类动态代码");
    }

    public Father(){
        System.out.println("父类构建方法");
    }
}
class Son extends Father{
    static String D="子类静态属性";
     String  C="子类实例属性";
    static{
        System.out.println(D);
        System.out.println("子类静态代码");
    }

    {
        System.out.println(C);
        System.out.println("子类动态代码");
    }

    public Son(){
        System.out.println("子类构建方法");
    }
}
