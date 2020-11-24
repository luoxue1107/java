package cn.kgc.pojo;

import cn.hutool.core.date.DateUtil;
import cn.kgc.util.BirthdayAge;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/18 15:18
 */
public class Doctor {
    private Integer uid;
    private String name;
    private Integer gender;
    private String birthday;
    private Integer did;
    private String id_Card;
    private Integer age ;

    public Doctor(Integer uid, String name, Integer gender, String birthday, Integer did, String id_Card) {
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.did = did;
        this.id_Card = id_Card;
        this.age= BirthdayAge.getAgeByBirth(DateUtil.parse(birthday));
    }

    public Doctor() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
        this.age= BirthdayAge.getAgeByBirth(DateUtil.parse(birthday));
    }

    public String getId_Card() {
        return id_Card;
    }

    public void setId_Card(String id_Card) {
        this.id_Card = id_Card;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
