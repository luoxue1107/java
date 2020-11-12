package cn.kgc.tangcco.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 11:40
 */
public class Author {
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

    public Author(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author() {
    }
}
