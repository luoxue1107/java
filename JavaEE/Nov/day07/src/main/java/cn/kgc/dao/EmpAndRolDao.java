package cn.kgc.dao;

import cn.kgc.pojo.Role;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 14:34
 */
public interface EmpAndRolDao {
    int[] insertEmpAndRol(Integer eid, Integer[] Rids);

    List<Integer> selectRidsByEid(Integer eid);

    Integer deleteRoleByEid(Integer eid);

    List<Role> selectRoleByEid(Integer eid);
}
