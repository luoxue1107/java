package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/25 16:26
 */
public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Clazz clazz;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(Integer id, String name, String gender, Clazz clazz) {
        System.out.println("Student有参构造");
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.clazz = clazz;
    }
    public Student(){
        System.out.println("Student无参构造");
    }
}
