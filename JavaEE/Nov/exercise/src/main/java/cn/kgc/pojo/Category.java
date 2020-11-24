package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/20 16:37
 */
public class Category {
    private Integer id;
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

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }
}
