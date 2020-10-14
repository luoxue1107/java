/**
 继承
 */
public class TestInherit {
    public static void main(String[] args) {
        Dug dug=new Dug();
        Cat cat=new Cat();
        Fish fish=new Fish();
        Bird bird=new Bird();
        dug.name="狗";
        System.out.println(dug.name);
        dug.eat();
        cat.name="猫";
        System.out.println(cat.name);
        cat.eat();
        fish.name="鱼";
        System.out.println(fish.name);
        fish.eat();
        bird.name="鸟";
        System.out.println(bird.name);
        bird.eat();
        dug.breathe();
        cat.breathe();
        fish.breathe();
        bird.breathe();
    }
}
//父类 动物
class Animal{
    //名
    String name;
    //公母 雌雄
    String sex;
    //年龄
    int age;

    public void eat(){
        System.out.println("吃食物");
    }
    public void breathe(){
    System.out.println("呼吸");
    }
}
//子类要继承父类 需加extends加父类名
class Dug extends Animal{
    //属性
    //毛色
  String hair;
    //方法
    public void jump(){
        System.out.println("跳");
}
}
class Cat extends Animal{
    //属性
    //毛色
    String hair;
    //方法
    public void creep(){
        System.out.println("爬");
    }
}
class Fish extends Animal{
    //属性
    //鳞片
    String scale;
    //方法
    public void swim(){
    System.out.println("游");
    }
}
class Bird extends Animal{
    //属性
    //毛色
    String hair;

    //方法
    public void fiy(){
    System.out.println("飞");
    }
}