package cn.kgc.service.impl;

import cn.kgc.dao.impl.EmpAndRolDaoImpl;
import cn.kgc.pojo.Role;
import cn.kgc.service.ServiceEmpAndRol;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 17:04
 */
public class ServiceEmpAndRolImpl implements ServiceEmpAndRol {
    @Override
    public Integer addEmpAndRol(Integer eid, Integer[] Rids) {
        EmpAndRolDaoImpl er=new EmpAndRolDaoImpl();
        Integer result = 1;

        int[] ints = er.insertEmpAndRol(eid,Rids);

        //若有一条插入失败则视为选课失败
        for (int i : ints) {
            if (ints[i] <= 0) {
                result = 0;
            }
        }

        return result;
    }

    @Override
    public List<Integer> getRidsByEid(Integer eid) {
        return null;
    }

    @Override
    public Integer delRoleByEid(Integer eid) {
        return null;
    }

    @Override
    public List<Role> getRoleByEid(Integer eid) {
        return null;
    }
}
