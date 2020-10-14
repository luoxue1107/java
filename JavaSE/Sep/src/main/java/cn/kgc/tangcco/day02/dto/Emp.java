package cn.kgc.tangcco.day02.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/2 18:18
 */
@Setter
@Getter
public class Emp {
    /**
     * 账号
     */
    private  String account;
    /**
     * 密码
     */
    private  String password;
    /**
     * 昵称
     */
    private  String nickname;

    public Emp(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public Emp(String account, String password, String nickname) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
    }
}
