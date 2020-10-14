package cn.kgc.tangcco.day31.vo;

import cn.hutool.core.util.IdcardUtil;
import cn.kgc.tangcco.day31.dto.User;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/31 20:46
 */
public class UserVo extends User {
    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别   1代表男性 0代表女性
     */
    private Integer gender;

    private String province;

    public UserVo(String uuid, String firstName, String lastName, String idCard, String mobile) {
        super(uuid, firstName, lastName, idCard, mobile);
        // 根据身份证号码获取你的年龄
        this.age = IdcardUtil.getAgeByIdCard(idCard);
        // 根据身份证号码获取你的性别
        this.gender = IdcardUtil.getGenderByIdCard(idCard);
        // 根据身份证号码获取你的省份
        this.province = IdcardUtil.getProvinceByIdCard(idCard);
    }

    public UserVo(User user) {
        this(user.getUuid(), user.getFirstName(), user.getLastName(), user.getIdCard(), user.getMobile());
        setId(user.getId());
        setStatus(user.getStatus());
        User.count--;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGender() {
        return gender;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + getId() +
                ", uuid=" + getUuid() +
                ", firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", idCard=" + getIdCard() +
                ", mobile=" + getMobile() +
                ", age=" + age +
                ", gender=" + ((gender == 1) ? "男性" : "女性") +
                ", status=" + ((getStatus() == 1) ? "生命如此绚烂" : "结束是新的开始") +
                ", province='" + province + '\'' +
                '}';
    }
}