package cn.kgc.tangcco.day13.Action;

import cn.kgc.tangcco.day13.service.UserService;
import cn.kgc.tangcco.day13.service.impl.UserServiceImpl;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 19:27
 */
public class UserAction {

    private  static UserService userService =new UserServiceImpl();
    public void  addUser(){
        userService.addUser();

    }
}
