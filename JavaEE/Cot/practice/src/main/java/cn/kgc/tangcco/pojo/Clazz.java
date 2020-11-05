package cn.kgc.tangcco.pojo;

/**
 * 教室类
 * @author 李庆华
 * @Description
 * @date 2020/10/29 12:01
 */
public class Clazz {
    /**
     * 教室编号
     */
    private Integer id;
    /**
     * 教室名称
     */
    private String name;

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

    public Clazz(Integer id, String name) {
        this(name);
        this.id = id;
    }
    public Clazz(String name){
       this.name = name;
    }

    public Clazz() {}
}
