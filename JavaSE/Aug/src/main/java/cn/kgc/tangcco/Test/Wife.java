package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/19 17:17
 */
public class Wife {
    /**
     * 姓名
     */
    static String name;
    /**
     *年龄
     */
      static int age;
    /**
     * 丈夫
     */
    Husband husband;
    public static String showlnfo(){
        return "姓名:"+name+"\n年龄:"+age+"\n丈夫名字"+Husband.name+"\n丈夫年龄"+Husband.age;
    }
}
