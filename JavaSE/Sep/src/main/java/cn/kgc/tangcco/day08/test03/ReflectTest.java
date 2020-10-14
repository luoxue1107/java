package cn.kgc.tangcco.day08.test03;

import cn.kgc.tangcco.day01.tang01.Manager;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/8 9:29
 */
public class ReflectTest {
    public static void main(String[] args) {
        //Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        try {
            //无参构造
            Constructor<PrivateTest> constructor = privateTestClass.getConstructor();
            //实例化对象
            PrivateTest privateTest = constructor.newInstance();
            //对象方法
            Method getName = privateTestClass.getMethod("getName");
            //打印
            System.out.println(getName.invoke(privateTest));
            //对象属性
            Field name = privateTestClass.getDeclaredField("name");
            //访问权限
            name.setAccessible(true);
            //修改初始值
            name.set(privateTest, "Tom");
            //再次打印
            System.out.println(name.get(privateTest));
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
