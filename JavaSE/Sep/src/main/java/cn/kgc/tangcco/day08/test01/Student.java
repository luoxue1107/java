package cn.kgc.tangcco.day08.test01;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description
 * @author 李庆华
 * @date 2020/9/8 8:42
 */
@Getter
@Setter
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

    public Student(){
        System.out.println("我是无参构造");
    }
    public Student(String name, Integer age) {
        System.out.println("我是有参构造");
        this.name = name;
        this.age = age;
    }
}
