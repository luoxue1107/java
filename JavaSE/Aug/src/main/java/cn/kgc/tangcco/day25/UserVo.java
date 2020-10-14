package cn.kgc.tangcco.day25;
import cn.hutool.core.util.IdcardUtil;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/25 19:23
 */
public class UserVo extends User {
    /**
     * 年龄
     */
    private  Integer age;
    /**
     * 性别
     */
    private  Integer gender;

    private  String province;

    public UserVo(Integer age, Integer gender, String province) {
        this.age = age;
        this.gender = gender;
        this.province = province;
    }

    public UserVo(String uuid, String firsName, String lastName, String idCard, String mobile) {
        super(uuid, firsName, lastName, idCard, mobile);
        //根据身份证号 获取年龄
        this.age = IdcardUtil.getAgeByIdCard(idCard);
        //根据身份证号 获取性别
        this.gender = IdcardUtil.getGenderByIdCard(idCard);
        //根据身份证号 获取地址
        this.province = IdcardUtil.getProvinceByIdCard(idCard);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    @Override
    public String toString() {
        return "UserVo{" +
                "id="+super.getId()+'\''+
                ", firsName='" + getFirsName()+ '\'' +
                ", lastName='" + getLastName()+ '\'' +
                "age=" + age +
                ", gender=" + ((gender)==0? "大波浪":"锡纸烫")+
                ", province='" + province + '\'' +
                '}';
    }
}
