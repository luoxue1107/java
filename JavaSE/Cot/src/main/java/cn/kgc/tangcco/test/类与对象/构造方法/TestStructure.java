public class TestStructure {
    //构造方法
    public static void main(String[]args){
        Student s = new Student();
        s.name="Tom";
        s.age=21;
        s.sex="男";
        s.score=100;
        System.out.println(s.name+"\t"+s.age+"\t"+s.sex+"\t"+s.score);
        Student s1=new Student("Jerry",20,"女",100);
        System.out.println(s1.name+"\t"+s1.age+"\t"+s1.sex+"\t"+s1.score);
        s.method();
    }
}
class Student{
    String name;
    int age;
    String sex;
    double score;
    //构造方法也可以重载
    public Student(){
        System.out.println("无参构造方法");
    }
    public Student(String name,String sex){
        this();
        this.name=name;
        this.sex=sex;
        System.out.println("两参构造方法");
    }
    public Student(String name,int age,String sex){
        this(name,sex);
        this.age=age;
        System.out.println("三参构造方法");
    }
    public Student(String name,int age,String sex,double score){
       this(name,age,sex);
        this.score=score;
        System.out.println("四参构造方法");
    }
    public void method(){
        System.out.println("实例方法");
    }
}