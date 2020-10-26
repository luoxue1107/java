package cn.kgc.tangcco.person;

/**
 * @author 李庆华
 * @Description 科室表
 * @date 2020/10/26 13:56
 */
public class Office {
//    id	int	科室编号，主键自增
//    name	varchar(32)	科室名称
    /**
     * 科室编号
     */
    private  Integer id;
    /**
     * 科室名称
     */
    private  String name;
    public Office(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public  Office (){}

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


