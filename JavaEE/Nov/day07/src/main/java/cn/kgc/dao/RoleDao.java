package cn.kgc.dao;

import cn.kgc.pojo.Role;
import java.util.List;

/**
 * @author 李庆华
 * @Description 连接数据库角色信息接口
 * @date 2020/11/7 13:44
 */
public interface RoleDao {
    public List<Role> selectAllRile();
    public Role selectRoleById(Integer id);
    public Integer insertOneRole(Role role);
    public Integer updateOneRole(Role role);
    public Integer deleteRoleById(Integer id);
}
