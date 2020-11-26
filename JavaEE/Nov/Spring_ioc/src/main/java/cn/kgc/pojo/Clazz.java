package cn.kgc.pojo;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/25 16:25
 */
public class Clazz {
    private  Integer id;
    private String name;
    private List<Student>  studentList;
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Clazz(Integer id, String name,List<Student> studentList) {
        System.out.println("Clazz有参构造");
        this.id = id;
        this.name = name;
        this.studentList=studentList;
    }
    public  Clazz(){
        System.out.println("Clazz无参构造");
    }

}
