package cn.kgc.tangcco.day16.vo;

import cn.hutool.core.util.IdcardUtil;
import cn.kgc.tangcco.day16.pojo.Person;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author 李庆华
 * @Description
 * @create 2020/10/14 10:51
 */

public class PersonVo extends Person {
    /**
     * 性别 1代表男性 0代表女性
     */
    private Integer gender;
    /**
     * 出生日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 年龄
     */
    private Integer age;

    public PersonVo(Integer id, String uuid, String idCard, String fisrName, String lastName) {
        super(id, uuid, idCard, fisrName, lastName);
        this.gender = IdcardUtil.getGenderByIdCard(idCard);
        this.birthday = IdcardUtil.getBirthDate(idCard);
        this.age = IdcardUtil.getAgeByIdCard(idCard);
    }

    @Override
    public void setIdCard(String idCard) {
        super.setIdCard(idCard);
        this.gender = IdcardUtil.getGenderByIdCard(idCard);
        this.birthday = IdcardUtil.getBirthDate(idCard);
        this.age = IdcardUtil.getAgeByIdCard(idCard);
    }

    public PersonVo() {
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
