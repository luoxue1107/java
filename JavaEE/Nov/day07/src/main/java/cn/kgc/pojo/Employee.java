package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description 员工信息类
 * @date 2020/11/7 13:48
 */
public class Employee {
    private Integer id;
    private String name;
    private Integer cid;
    private String cname;

    public Employee(Integer id, String name, Integer cid) {
        this.id = id;
        this.name = name;
        this.cid = cid;
    }

    public Employee() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
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
