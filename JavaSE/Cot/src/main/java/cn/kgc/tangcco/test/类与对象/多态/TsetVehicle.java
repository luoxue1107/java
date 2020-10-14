public class TestVehicle {
    //多态
    public static void main(String[]args){
        Bus bus=new Bus();
        bus.type="公交车";
        bus.speed=50;
        bus.price=200000.0;
        bus.seatNum=20;
        Car car=new Car();
        car.type="小汽车";
        car.speed=120;
        car.brand="宝马";
        car.price=2000000.0;
        Bicycle bicycle=new Bicycle();
        bicycle.type="自行车";
        bicycle.speed=20;
        bicycle.price=5000.0;
        bicycle.color="白";
        Employee employee=new Employee();
        employee.name="Tow";
        employee.goHome(bus);
        employee.goHome(bicycle);
        employee.goHome(car);
        System.out.println("____________________________________________");
        Employee employee1 = new Employee();
        employee1.name="jeke";
        Vehicle my=employee1.buyVehicle(150);
        if (my!=null){
        employee1.goHome(my);
        }else{
            System.out.println("都买不起");
        }
    }
}
//应用父子类
class Employee{
    String name;
    public void goHome(Vehicle vehicle){//形参为父类的类型  也等于一个变量 Vehicle vehicle = 子类名 也是子类地址
        System.out.println(name+"正在乘坐");
        vehicle.run();
    }
    public Vehicle buyVehicle(int money){//父类也可当作返回值类型 返回值为子类对象 也可说是返回子类地址
        Vehicle my=null;
        if (money>100){
            Bus bus=new Bus();
            bus.type="公交车";
            bus.speed=50;
            bus.price=200000.0;
            bus.seatNum=20;
            my = bus;
        } else if (money>50){
            Car car=new Car();
            car.type="小汽车";
            car.speed=120;
            car.brand="奔驰";
            car.price=2000000.0;
            my = car;
        }else if(money>20){
            Bicycle bicycle=new Bicycle();
            bicycle.type="自行车";
            bicycle.speed=20;
            bicycle.price=5000.0;
            bicycle.color="红";
            my = bicycle;
        }
        return my;//返回子类地址
    }
}
//父类
class Vehicle{
    String type;//车的类型
    double price;//价格
    int speed;//速度
    public void run(){
        System.out.println("一辆价值"+price+"的"+type+"正在以"+speed+"/H的速度前进>>>");
    }
}
//子类
class Bus extends Vehicle{
    int seatNum;//座位数
    public void run(){//子类的重写 也就是覆盖父类里的同样方法 如果不重写执行的方法就是父类里的
        System.out.println("一辆"+price+"的，拥有"+seatNum+"个座位的"+type+"正在以"+speed+"/H的速度前进>>>");
    }
}
//子类
class Car extends Vehicle{
    String brand;//品牌
    public void run(){
        System.out.println("一辆"+price+"的,"+brand+"品牌的"+type+"正在以"+speed+"/H的速度前进>>>");
    }

}//子类
class Bicycle extends Vehicle{
    String color;
    public void run(){
        System.out.println("一辆"+price+"的,"+color+"颜色的"+type+"正在以"+speed+"/H的速度前进>>>");
    }
}
