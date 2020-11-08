package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description 角色信息类
 * @date 2020/11/7 13:48
 */
public class Role {
    private Integer id;
    private String name;

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Role() {
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
