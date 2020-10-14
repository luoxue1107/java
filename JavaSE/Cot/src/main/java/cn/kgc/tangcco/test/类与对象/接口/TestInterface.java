package Test;
//接口
public class TestInterface {
    public static void main(String[] args) {
        Dug4 dug=new Dug4();
        dug.eat();
        dug.sleep();
        dug.run();
        dug.swim();
        Animal4 an=new Dug4();
        an.eat();
        Dug4 dug1=(Dug4) an;
        dug1.run();
    }
}
//父类
abstract class Animal4{
    String breed;
    int ade;
    String sex;
    public abstract void eat();
    public abstract void sleep();
}
//接口 接口是一种能力 把这个能力赋予给别的类；
interface Run{
    //接口中的方法也是一种规定；
    public abstract void run();
}
interface Swim{
    //接口里 写public static final 和不写都可以的
    public static final int a=10;
    //接口里 写public abstract 和不写都可以
    public abstract  void swim();
}
//子类 应用接口需要在类名 后加implements（实现） 加接口名
// 如果需要多个接口加逗号分隔再加 接口名
class Dug4 extends Animal4 implements Run,Swim{
    public void eat(){
        System.out.println("狗在吃");
    }
    public void sleep(){
        System.out.println("狗在睡");
    }
    public void run(){
        System.out.println("狗在跑");
    }
    public void swim(){
        System.out.println("狗在游");
    }
}
class Cat4 extends Animal4 implements Run{
    public void eat(){
        System.out.println("猫在吃");
    }
    public void sleep(){
        System.out.println("猫在睡");
    }
    public void run(){
        System.out.println("猫在跑");
    }
}
class Bird4 extends Animal4 implements Run{
    public void eat(){
        System.out.println("鸟在吃");
    }
    public void sleep(){
        System.out.println("鸟在睡");
    }
    public void run(){
        System.out.println("鸟在跑");
    }
}
class Fish4 extends Animal4 implements Swim{
    public void eat(){
        System.out.println("鱼在吃");
    }
    public void sleep(){
        System.out.println("鱼在睡");
    }
    public void swim(){
        System.out.println("鱼在游");
    }
}
