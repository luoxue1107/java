package cn.kgc.tangcco.day13;


import java.io.Serializable;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/13 18:31
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -142869295028370865L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
