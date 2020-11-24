package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/20 16:49
 */
public class Book {
   private String name;
   private  Integer cid;
   private  Integer pid;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Book( String name, Integer cid, Integer pid) {
        this.name = name;
        this.cid = cid;
        this.pid = pid;
    }

    public Book() {
    }
}
