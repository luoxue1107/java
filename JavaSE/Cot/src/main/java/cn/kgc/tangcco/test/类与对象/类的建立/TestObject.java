public class TestObject {
    public static void main(String[]args){
        student D=new student();
        D.name="李庆华";
        D.sex = "男";
        D.age = 21;
        D.score = 50;
        D.method();
    }
}
class student{
    String name;
    String sex;
    int age;
    double score;
    public void method(){
        System.out.println("姓名:"+name);
        System.out.println("性别:"+sex);
        System.out.println("年龄:"+age);
        System.out.println("分数:"+score);
    }
}
