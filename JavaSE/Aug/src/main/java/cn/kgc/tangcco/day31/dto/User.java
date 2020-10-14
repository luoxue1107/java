package cn.kgc.tangcco.day31.dto;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/31 20:32
 */
public class User {
    /**
     * 数据库主键
     */
    private Integer id = 0;
    public static Integer count = 0;
    /**
     * 系统唯一标识符
     */
    private String uuid;
    /**
     * 曾用名
     */
    private String firstName;
    /**
     * 现用名
     */
    private String lastName;
    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 生死状态
     */
    private int status = 1;


    public User() {
        // id = ++count;
    }

    public User(String uuid, String firstName, String lastName, String idCard, String mobile) {
        id = ++count;
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idCard = idCard;
        this.mobile = mobile;
    }

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}