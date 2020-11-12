package cn.kgc.service.impl;

import cn.kgc.dao.impl.RoleDaoImpl;
import cn.kgc.pojo.Role;
import cn.kgc.service.ServiceRole;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 14:00
 */
public class ServiceRoleImpl implements ServiceRole {
    RoleDaoImpl role= new RoleDaoImpl();
    @Override
    public List<Role> getRole() {
        return role.selectAllRile();
    }

    @Override
    public Role getRoleById(Integer id) {
        return role.selectRoleById(id);
    }

    @Override
    public Integer addOneRole(Role r) {
       return role.insertOneRole(r);
    }

    @Override
    public Integer setOneRole(Role r) {
        return role.updateOneRole(r);
    }

    @Override
    public Integer deleteRoleById(Integer id) {
        return role.deleteRoleById(id);
    }
}
