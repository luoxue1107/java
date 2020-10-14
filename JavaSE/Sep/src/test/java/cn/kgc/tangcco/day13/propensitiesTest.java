package cn.kgc.tangcco.day13;

import cn.hutool.setting.dialect.Props;
import cn.kgc.tangcco.day13.dao.UserDao;
import org.junit.Test;
import org.springframework.core.io.support.PropertiesLoaderSupport;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 19:38
 */
public class propensitiesTest {
   @Test
    public void test01(){
       //this.getClass 拿到当前对象类 getClassLoader 拿到类加载器  get.ResourceAsStream 获取源文件  返回一个输入流  name 相对路径
       InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("bean.properties");
       //解析properties文件类
       Properties properties = new Properties();
       try {
           //从输入字节流读取属性列表（键和元素对）
           properties.load(resourceAsStream);
           //使用此属性列表中指定的键搜索属性。
           String userDao = properties.getProperty("UserDao");
           System.out.println(userDao);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    @Test
    public void test02(){
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("bean.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            String userDao = properties.getProperty(UserDao.class.getSimpleName());
           // 回与给定字符串名称的类或接口相关联的 类对象。
            Class<?> aClass = Class.forName(userDao);
            //对象的构造方法
            Constructor<?> constructors = aClass.getDeclaredConstructor();
            //允许调用私有。
            constructors.setAccessible(true);
            //实例化对象
            UserDao o = (UserDao) constructors.newInstance();
            //调用对象中的方法
            o.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       //hutool依赖包装的方法
        Props props = new Props("bean.properties");
        String property = props.getProperty(UserDao.class.getSimpleName());
        System.out.println(property);
        Class<?> clazz = Class.forName(property);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        UserDao uDao = (UserDao) constructor.newInstance();
        uDao.test();
    }
    @Test
    public void test04(){
        // 通过Spring中的PropertiesLoaderUtils工具类进行获取
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("bean.properties");
            String userDao = properties.getProperty("UserDao");
            System.out.println(userDao);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
