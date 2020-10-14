package drill;

public class laoshi {
    //属性
    String xingshi;
    String jiaoshou;
    int jiaoling;
    //方法
    public void shouke(){
        System.out.println("李老师");
        System.out.println("我叫"+xingshi);
        System.out.println("授课"+jiaoshou);
        System.out.println("教龄"+jiaoling);

    }
}
class ys{
    public static void main(String[] args) {
        //根据老师类创建一个对象
        laoshi i=new laoshi();
        i.xingshi="老师";
        i.jiaoshou= "java";
        i.jiaoling=10;

        i.shouke();
    }
}
