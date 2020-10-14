package cn.kgc.tangcco.day08.test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/8 8:45
 */
public class NewInstanceTest {
    public static void main(String[] args) {
        //class对象
        Class<Student> studentClass = Student.class;
        try {
            //构造方法
            Constructor<Student> constructor = studentClass.getConstructor();
            //对象实例化
            Student student = constructor.newInstance();
            //有参构造方法
            Constructor<Student> constructor2 = studentClass.getConstructor(String.class, Integer.class);
            //对象实例化
            Student student2 = constructor2.newInstance("Tom", 18);

        } catch (NoSuchMethodException | InstantiationException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
