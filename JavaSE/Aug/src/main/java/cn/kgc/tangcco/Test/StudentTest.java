package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/19 15:39
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student =new Student();
        student.age=18;
        student.name="Tow";
        student.gender='男';
        student.id="12345";
        System.out.println(student.show());
    }
}
