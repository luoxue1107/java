package cn.kgc.tangcco.day13.service.impl;

import cn.kgc.tangcco.day13.dao.UserDao;
import cn.kgc.tangcco.day13.dao.impl.UserDaoImpl;
import cn.kgc.tangcco.day13.service.UserService;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 19:23
 */
public class UserServiceImpl implements UserService {
    private  static UserDao userDao =new UserDaoImpl();
    @Override
    public void addUser() {
        userDao.test();
    }
}
