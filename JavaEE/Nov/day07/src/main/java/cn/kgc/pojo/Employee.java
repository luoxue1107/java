package cn.kgc.pojo;

import java.util.List;

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
    private List<String> rnames;

    public Employee(Integer id, String name, Integer cid) {
        this(name,cid);
        this.id = id;

    }
    public Employee(String name, Integer cid) {
        this.name = name;
        this.cid = cid;

    }
    public Employee() {
    }

    public List<String> getRnames() {
        return rnames;
    }

    public void setRnames(List<String> rnames) {
        this.rnames = rnames;
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
