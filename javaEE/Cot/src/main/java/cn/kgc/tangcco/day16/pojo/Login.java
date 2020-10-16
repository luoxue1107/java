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
    private String password;
    /**
     * 验证码
     */
    private String code;
    /**
     * 登录人的在数据库中的主键
     */
    private Integer pid;

    public Login(String mobile ,String password, Integer pid) {
        this.mobile = mobile;
        this.password = password;
        this.pid = pid;
    }
}
