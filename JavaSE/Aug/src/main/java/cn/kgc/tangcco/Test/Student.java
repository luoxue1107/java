package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/19 15:29
 */
public class Student {
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;
    /**
     * 性别
     */
    char gender;
    /**
     * 学号
     */
    String id;

    public String show() {
        return "姓名:" + this.name + "\n性别:" + this.gender +"\n年龄:"+this.age +"\n学号:" + this.id;
    }


}
