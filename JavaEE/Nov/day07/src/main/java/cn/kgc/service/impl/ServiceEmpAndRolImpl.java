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

    private EmpAndRolDaoImpl er = new EmpAndRolDaoImpl();

    @Override
    public Integer addEmpAndRol(Integer eid, Integer[] Rids) {
        Integer result = 1;

        int[] ints = er.insertEmpAndRol(eid, Rids);

        if(ints.length==0) {
            result=0;
        }else {
            for (int i : ints) {
                if (ints[i] > 0) {
                    result = 1;
                }else {
                    result = 0;
                }
            }
        }
        return result;
    }

    @Override
    public List<Integer> getRidsByEid(Integer eid) {
       return er.selectRidsByEid(eid);
    }

    @Override
    public Integer delRoleByEid(Integer eid) {
        return er.deleteEmpAndRolByEid(eid);
    }

    @Override
    public List<Role> getRoleByEid(Integer eid) {
        return  er.selectRoleByEid(eid);

    }
}
