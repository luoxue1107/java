package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 15:19
 */
public class Department {
//             `uid` int(11) auto_increment comment'科室编号',
//            `name` varchar(50) not null comment'科室名称',
    private Integer uid;
    private String name;

    public Department(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public Department() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
