package cn.kgc.tangcco.day14;

import lombok.*;

import java.io.Serializable;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 15:04
 */
@Setter
@Getter
public class Demo01 implements Serializable {
    private  String id;
    private  String pwd;

    public Demo01(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public Demo01() {
    }
}
