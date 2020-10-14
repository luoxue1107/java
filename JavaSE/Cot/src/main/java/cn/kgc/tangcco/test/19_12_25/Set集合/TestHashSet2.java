package My;

import java.util.HashSet;
import java.util.Objects;

public class TestHashSet2 {
    public static void main ( String[] args ) {
        Student student=new Student ("tow",18,"男");
        Student student2=new Student ("Jake",13,"女");
        Student student3=new Student ("My",15,"男");
        Student student4=new Student ("My",15,"男");
        HashSet<Student> S=new HashSet<> (  );
        S.add ( student );
        S.add ( student2 );
        S.add ( student3 );
        S.add ( student4 );//地址不同 属性相同进行equals对比
        S.add ( student );//地址相同 不会重复
        for (Student s:S){
            System.out.println (s+"\n"+s.hashCode ());
        }

    }
}
class Student{
    String name;
    int age;
    String sex;
    public Student(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    @Override
    public boolean equals ( Object o ) {
        System.out.println ("equals");
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals ( name, student.name ) &&
                Objects.equals ( sex, student.sex );
    }

    @Override
    public String toString ( ) {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( name, age, sex );
    }
}
