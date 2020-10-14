package cn.kgc.tangcco.day14.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description
 * @create 2020/10/14 10:42
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
    private String passwrd;
    /**
     * 验证码
     */
    private String code;
    /**
     * 登录人的在数据库中的主键
     */
    private String pid;

    public Login(String mobile, String passwrd, String code) {
        this.mobile = mobile;
        this.passwrd = passwrd;
        this.code = code;
    }
}
