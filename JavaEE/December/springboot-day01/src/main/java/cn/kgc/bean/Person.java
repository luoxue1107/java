package cn.kgc.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/12/1 16:48
 */

@PropertySource(value = {"classpath:person.properties"})
//把此类加到spring容器 作为配置类
@Component
//告诉springboot 将本类中的所以属性和配置文件中的prefix指定相关配置文件进行绑定
//必须@Component将此类加到容器中才可以使用@ConfigurationProperties进行绑定
@ConfigurationProperties(prefix = "person")
//JSR3030数据校验
//@Validated
public class Person {
    // @Email
    // @Value("落雪")
    private String name;
    //    @Value("#{1*3}")
    private Integer age;
    //    @Value("1989/11/11")
    private Date birthday;
    private List<Object> lists;
    private Map<String, Object> maps;
    private Dog dog;

    public Person(String name, Integer age, Date birthday, List<Object> lists, Map<String, Object> maps, Dog dog) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.lists = lists;
        this.maps = maps;
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }
}
