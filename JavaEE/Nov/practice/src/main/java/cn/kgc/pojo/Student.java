package cn.kgc.pojo;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 17:26
 */
public class Student {
    private  Integer id;
    private String name;
    private List<Clazz> clazzList;

    public Student(Integer id, String name, List<Clazz> clazzList) {
        this.id = id;
        this.name = name;
        this.clazzList = clazzList;
    }

    public Student(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Clazz> getClazzList() {
        return clazzList;
    }

    public void setClazzList(List<Clazz> clazzList) {
        this.clazzList = clazzList;
    }
}
