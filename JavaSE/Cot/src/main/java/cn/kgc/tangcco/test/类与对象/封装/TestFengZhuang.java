import java.util.Scanner;

public class TestFengZhuang {
    //封装练习
    public static void main(String[]args){
        Student1 s=new Student1();
        Scanner input=new Scanner(System.in);
        System.out.println("姓名");
        s.name=input.next();
        System.out.println("性别");
        String S=input.next();
        System.out.println("年龄");
        int a=input.nextInt();
        System.out.println("分数");
        double sc=input.nextDouble();
        s.setSex(S);
        s.setAge(a);
        s.setScore(sc);
        System.out.println(s.name+"\n"+s.getSex()+"\n"+s.getAge()+"\n"+s.getScore());
    }
}
class Student1{
     String name;
     //私有修饰符 只能本类可用
    private String sex;
    private int age;
    private double score;
    //构造方法
    public Student1(){
    }
    //实例方法 名前加set赋值
    public void setSex(String sex){
        if ("男".equals(sex)||"女".equals(sex)){
            this.sex = sex;
        }else{
            this.sex ="男";
        }
    }
    //实例方法 名前加get返回值
    public String getSex(){
        return this.sex;
    }
    public void setAge(int age){
        if (age>300||age<=0){
            this.age=18;
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setScore(double score){
        if(score<=150||score>=0){
            this.score=score;
        }
        }

    public double getScore() {
        return score;
    }
}