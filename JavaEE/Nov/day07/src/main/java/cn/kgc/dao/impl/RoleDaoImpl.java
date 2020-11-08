package cn.kgc.dao.impl;

import cn.kgc.dao.RoleDao;
import cn.kgc.pojo.Role;
import cn.kgc.util.jdbc.JdbcUtil;
import java.sql.*;
import java.util.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/7 14:16
 */
public class RoleDaoImpl implements RoleDao {
    @Override
    public List<Role> selectAllRile() {
        List<Role> roleList = new ArrayList<>();

        String sql = "select * from role";

        JdbcUtil jdbcUtil=new JdbcUtil();

        ResultSet resultSet = jdbcUtil.executeQuery(sql);

        try {
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                roleList.add(new Role(id,name));
            }

            return roleList;
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
        finally {
            jdbcUtil.close();
        }
    }

    @Override
    public Role selectRoleById(Integer id) {
        String sql = "select * from role where id = ?";

        JdbcUtil jdbcUtil=new JdbcUtil();

        ResultSet resultSet = jdbcUtil.executeQuery(sql, id);

        try {
            if (resultSet.next()) {
                return new Role(resultSet.getInt("id"),resultSet.getString("name"));
            }
            else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
        finally {
            jdbcUtil.close();
        }
    }

    @Override
    public Integer insertOneRole(Role role) {
        JdbcUtil jdbcUtil = new JdbcUtil();

        Integer status = jdbcUtil.executeUpdate("insert into role(name) values (?)", role.getName());

        jdbcUtil.close();

        return status;
    }

    @Override
    public Integer updateOneRole(Role role) {
       JdbcUtil jdbcUtil = new JdbcUtil();

        Integer status = jdbcUtil.executeUpdate("update role set name = ? where id = ?", role.getName(), role.getId());

        jdbcUtil.close();

        return status;
    }

    @Override
    public Integer deleteRoleById(Integer id) {
     JdbcUtil jdbcUtil = new JdbcUtil();
        Integer status = jdbcUtil.executeUpdate("delete from role where id = ?", id);

        jdbcUtil.close();

        return status;
    }
}
