package cn.kgc.tangcco.day16.pojo;

/**
 * @author 李庆华
 * @Description
 * @create 2020/10/14 10:39
 */
public class Person {
    /**
     * 数据库主键
     */
    private Integer id;
    /**
     * 系统唯一标识符
     */
    private String uuid;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 曾用名
     */
    private String fisrName;
    /**
     * 现用名
     */
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getFisrName() {
        return fisrName;
    }

    public void setFisrName(String fisrName) {
        this.fisrName = fisrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(Integer id, String uuid, String idCard, String fisrName, String lastName) {
        this.id = id;
        this.uuid = uuid;
        this.idCard = idCard;
        this.fisrName = fisrName;
        this.lastName = lastName;
    }

    public Person() {
    }
}
