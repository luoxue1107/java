package Test;
  //接口流程
public class TestUSB {
    public static void main(String[] args) {
        USB u1= new USBDisk();
        USB u2= new USBFan();
        USB u3= new USBLamp();
        Computer c =new Computer(u1,u2,u3);
    }
}
//接口
interface USB{
    public abstract void a();
}
//工具类
class Computer{
    USB u1;
    USB u2;
    USB u3;
    public Computer(){}
    public Computer(USB u1){
        this.u1=u1;

        u1.a();

    }
    public Computer(USB u1,USB u2){
        this.u1=u1;
        this.u2=u2;
        u2.a();
        u1.a();
    }


    public Computer(USB u1,USB u2,USB u3){
        this.u1=u1;
        this.u2=u2;
        this.u3=u3;
        u1.a();
        u2.a();
        u3.a();
    }
}
//接口 实现类
class USBLamp implements USB{
    //实现行为
    public void a(){
        System.out.println("灯亮了>>>");
    }
}
//接口 实现类
class USBFan implements USB{
    public void a(){
        System.out.println("风扇在转>>>");
    }
}
//接口 实现类
class USBDisk implements USB{
    public void a(){
    System.out.println("U盘在存储>>>");
    }
}