package cn.kgc.tangcco.day13;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/13 18:29
 */
public class Demo02 {
    @Test
    public void test01() throws IOException {
        //序列化
        Person person = new Person("Tom",18);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/resources/person.txt"));
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
    }
    @Test
    public void test02() throws IOException, ClassNotFoundException {
        //反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/resources/person.txt"));
       Person person = (Person) objectInputStream.readObject();
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
    @Test
    public void test03(){
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("src/resources/bean.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            String userDao = properties.getProperty("UserDao");
            System.out.println(userDao);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
