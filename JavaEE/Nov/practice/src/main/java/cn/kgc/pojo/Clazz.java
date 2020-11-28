package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 20:03
 */
public class Clazz {
    private  Integer id;
    private String name;

    public Clazz(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
public  Clazz(){}
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
