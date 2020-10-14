package cn.kgc.tangcco.day31.service.impl;

import cn.kgc.tangcco.day31.dto.User;
import cn.kgc.tangcco.day31.service.UserService;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/31 21:03
 */
public class UserServiceImpl implements UserService {
    private  static UserDao userDao=new UserServiceImpl();


    @Override
    public List queryAllUsers() {
        return null;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }
}
