package My;

public class TestDefined {
    //自定义异常
    public static void main ( String[] args ){
        Student2 stu=new Student2 ();
        try {
            stu.setAge ( 3000 );
        } catch (Class1 class1) {
            class1.printStackTrace ();
        }
        try {
            stu.setSxe ( "da" );
        } catch (Exception e) {
        e.printStackTrace ();
        }
    }
}
//这个类 继承了受查异常
class Class1 extends Exception{
    public Class1(){};
    public Class1(String s){
        super(s);
    }
}
//这个类 继承了 运行时异常
class Class2 extends RuntimeException{
    public Class2(){}
    public Class2(String s){
        //构造方法中调父类构造方法并进行有参构造的赋值
        super(s);
    }
}
class Student2{
    private int age;
    private String sxe;

    public void setSxe ( String sxe ) throws RuntimeException {
        if (sxe.equals ( "男" )||sxe.equals ( "女" )) {
            this.sxe = sxe;
        }else {
            throw new Class2 ("性别输入不正确 请输入“男”或“女”" );
        }
    }

    public String getSxe ( ) {
        return sxe;
    }

    public void setAge ( int age ) throws Class1 {
        if(age >0 && age <=256){
            this.age = age;
        }else {
                //这里是抛出 继承了受查异常的子类
                throw new Class1 ( "年龄 请输入 0 ~ 256的整数" );
        }

    }

    public int getAge ( ) {
        return age;
    }
}