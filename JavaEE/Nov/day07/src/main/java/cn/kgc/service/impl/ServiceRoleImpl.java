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
}
