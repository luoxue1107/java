package cn.kgc.tangcco.day25;

/**
 * @author 李庆华
 * @Description 作业
 * @date 2020/8/25 16:51
 */
public class User {
    /**
     * 数据库主键
     */
    private Integer id = 0;
    private  static Integer count=0;
    /**
     * 系统唯一标识符
     */
    private String uuid;
    /**
     * 曾用名
     */
    private  String firsName;
    /**
     * 现用名
     */
    private  String lastName;
    /**
     * 手机号
     */
    private  String mobile;
    /**
     * 身份证
     */
    private  String idCard;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCard() {
        return idCard;
    }

    public Integer getId() {
        return id;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public User(){
        this.id =++count;
    }

    public  User(String uuid, String firsName, String lastName, String idCard, String mobile){
        this.id = ++count;
        this.uuid = uuid;
        this.firsName = firsName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
