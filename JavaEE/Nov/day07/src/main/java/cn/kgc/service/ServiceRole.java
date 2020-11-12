package cn.kgc.service;

import cn.kgc.pojo.Role;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 13:34
 */
public interface ServiceRole {
    List<Role> getRole();

    Role getRoleById(Integer id);

    Integer addOneRole(Role role);

    Integer setOneRole(Role role);

    Integer deleteRoleById(Integer id);
}
