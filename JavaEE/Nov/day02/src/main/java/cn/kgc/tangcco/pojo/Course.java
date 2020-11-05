package cn.kgc.tangcco.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/2 19:47
 */
public class Course {
    /**
     * 编号
     */
    Integer id;
    /**
     * 名称
     */
    String name;

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course() {
    }

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
}
