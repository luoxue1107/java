package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description 公司信息类
 * @date 2020/11/7 13:48
 */
public class Company {
    private Integer id;
    private String name;

    public Company(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company() {
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
