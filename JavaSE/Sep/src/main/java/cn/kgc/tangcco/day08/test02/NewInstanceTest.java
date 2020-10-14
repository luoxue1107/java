package cn.kgc.tangcco.day08.test02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/8 9:09
 */
public class NewInstanceTest {
    public static void main(String[] args) {
        //获取该类的class对象
        Class<MyTxt> myTxtClass= MyTxt.class;

            try {
                //获取该类对象的构造方法
               Constructor<MyTxt> constructor = myTxtClass.getConstructor();
               //使用该类构造方法将该类的对象实例化
               MyTxt  myTxt = constructor.newInstance();
               //用该类的对象获取该的方法
              Method myCreate =myTxtClass.getMethod("myCreate");
              //执行方法
              myCreate.invoke(myTxt);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }


    }
}
