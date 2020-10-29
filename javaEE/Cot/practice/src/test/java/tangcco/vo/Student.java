package tangcco.vo;

import cn.hutool.core.util.IdcardUtil;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/27 13:07
 */
public class Student {
    /**
     * 学生编号
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 姓名
     */
    private String gender;
    /**
     * 出生日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 班级号
     */
    private Integer cid;
    /**
     * class
     */
    private String clazz;
    /**
     * 年龄
     */
    private  Integer age;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Student ( Integer id,String name,String idCard, Integer cid,String clazz)
    {
        this.id = id;
        this.name = name;
        this.cid = cid;
        this.clazz = clazz;
        this.gender = IdcardUtil.getGenderByIdCard(idCard) == 1 ? "男":"女";
        this.birthday = IdcardUtil.getBirthDate(idCard);
        this.age = IdcardUtil.getAgeByIdCard(idCard);
    }
    public Student(){}
}
