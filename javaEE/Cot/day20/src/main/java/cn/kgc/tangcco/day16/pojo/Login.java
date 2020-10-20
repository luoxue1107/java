package cn.kgc.tangcco.day16.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description
 * @create 2020/10/14 10:42
 */
public class Login {
    /**
     * 数据库主键
     */
    private Integer id;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 验证码
     */
    private String code;
    /**
     * 登录人的在数据库中的主键
     */
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Login(Integer id, String mobile, String password, String code, Integer pid) {
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.code = code;
        this.pid = pid;
    }

    public Login(String mobile , String password, Integer pid) {
        this.mobile = mobile;
        this.password = password;
        this.pid = pid;
    }

    public Login() {
    }
}
