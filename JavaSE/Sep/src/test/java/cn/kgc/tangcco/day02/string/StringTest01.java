package cn.kgc.tangcco.day02.string;

import org.junit.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 20:57
 */
public class StringTest01 {
    @Test
    public void test01() {
        String str01 = "李庆华";
        String str02 = "李庆华";
        // equals方法比较内容是否一致 内容一致返回true 内容不一致返回false
        System.out.println(str01.equals(str02));
        // compareTo方法比较内容是否一致 内容一致返回整数零 内容不一致返回非零整数
        System.out.println(str01.compareTo(str02));
        System.out.println(str01 == str02);
    }
    @Test
    public void test02(){
        String str01 = new String("李庆华");
        String str02 = new String("李庆华");
        // equals方法比较内容是否一致 内容一致返回true 内容不一致返回false
        System.out.println(str01.equals(str02));
        // compareTo方法比较内容是否一致 内容一致返回整数零 内容不一致返回非零整数
        System.out.println(str01.compareTo(str02));

        System.out.println(str01 == str02);
        // 问:new String("abc")在内存中创建了几个新对象
        // 答:一个或者两个
    }
    @Test
    public void test03() {
        // 加号遇到字符串就不再是数学运算了而是字符串的拼接
        int a = 10, b = 20 , c;
        c = a + b;
        System.out.println(c);
        String str = "" + 50;
        // instanceof 严格来说是Java中的一个双目运算符，用来测试一个对象是否为一个类的实例
        System.out.println(str instanceof String);
        // concat方法代表字符串的拼接
        String d = "a".concat("b");
        System.out.println(d);
    }

}
