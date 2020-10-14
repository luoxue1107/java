package cn.kgc.tangcco.day31.service;

import cn.kgc.tangcco.day31.dto.User;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/31 20:53
 */
public interface UserService {
    /**
     * 查询所有用户
     *
     */
    public abstract List queryAllUsers();
    /**
     * 删除用户
     */
    public abstract  boolean deleteUser(User user);



}
