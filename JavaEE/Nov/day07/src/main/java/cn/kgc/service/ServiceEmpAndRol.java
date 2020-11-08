package cn.kgc.service;

import cn.kgc.pojo.Role;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 17:03
 */
public interface ServiceEmpAndRol {
    Integer addEmpAndRol(Integer eid, Integer[] Rids);

    List<Integer> getRidsByEid(Integer eid);

    Integer delRoleByEid(Integer eid);

    List<Role> getRoleByEid(Integer eid);
}
