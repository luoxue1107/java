package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/19 17:16
 */
public class Husband {
    /**
     * 姓名
     */
     static String name;
    /**
     * 年龄
     */
   static int age;
    /**
     * 妻子
     */
    Wife wife;
    public static   String showlnfo(){
        return "姓名:"+name+"\n年龄:"+age+"\n妻子名字"+Wife.name+"\n妻子年龄"+Wife.age;
    }

}
