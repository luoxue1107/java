package cn.kgc.tangcco.person;

import cn.hutool.core.util.IdcardUtil;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author 李庆华
 * @Description 医生表
 * @date 2020/10/26 13:50
 */
public class Doctor {
//    id	int	医生编号，主键自增
//    name	varchar(32)	姓名
//    sex	varchar(8)	性别
//    birthday	date	生日
//    fid	int	外键，对应科室主键
    /**
     * 医生编号
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 生日
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 外键
     */
    private Integer fid;


    public Doctor(Integer id, String name, String idCard, Integer fid) {
        this.id = id;
        this.name = name;
        this.gender = IdcardUtil.getGenderByIdCard(idCard);
        this.birthday = IdcardUtil.getBirthDate(idCard);
        this.age = IdcardUtil.getAgeByIdCard(idCard);
        this.fid= fid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
