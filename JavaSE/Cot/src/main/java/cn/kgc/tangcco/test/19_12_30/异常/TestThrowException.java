package My;

public class TestThrowException {
    public static void main ( String[] args ) {
        Student1 student1=new Student1 ();
        student1.setAge ( 0 );




    }
}

class Student1{
    private int age;

    public void setAge ( int age ) {
    if (age>18 && age<300){
        this.age=age;
    }else {
        //new 的异常的类的对象
        RuntimeException e= new RuntimeException (  );
        //这里就等于是 throw new RuntinmeException();
        throw e;
    }
    }

    public int getAge ( ) {
        return age;
    }
}