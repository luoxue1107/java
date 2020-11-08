package cn.kgc.dao.impl;

import cn.kgc.dao.EmpAndRolDao;
import cn.kgc.pojo.Role;
import cn.kgc.util.jdbc.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 14:35
 */
public class EmpAndRolDaoImpl implements EmpAndRolDao {
    @Override
    public int[] insertEmpAndRol(Integer eid, Integer[] Rids) {
        Integer length = Rids.length;

        JdbcUtil jdbcUtil =new JdbcUtil();

        Integer[][] params = new Integer[length][2];

        for (int i = 0; i < params.length; i++) {
            params[i][0] = eid;
            params[i][1] = Rids[i];
        }

        String sql = "insert into EmpAndRol(eid, rid) values (?, ?)";

        int[] ints = jdbcUtil.excuteBatch(sql, params);

        jdbcUtil.close();

        return ints;
    }


    @Override
    public List<Integer> selectRidsByEid(Integer eid) {
        List<Integer> Rids = new ArrayList<>();

        String sql = "select * from EmpAndRol where sid = ?";

        JdbcUtil jdbcUtil = new JdbcUtil();

        ResultSet resultSet = jdbcUtil.executeQuery(sql, eid);

        try {
            while(resultSet.next()) {
                Rids.add(resultSet.getInt("rid"));
            }

            return Rids;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        } finally {
            jdbcUtil.close();
        }
    }

    @Override
    public Integer deleteRoleByEid(Integer eid) {
        return null;
    }

    @Override
    public List<Role> selectRoleByEid(Integer eid) {
        List<Role> roleList = new ArrayList<>();

        String sql = "select r.* from Role as r,EmpAndRol as er  where r.id=er.rid and er.eid = ?";

        JdbcUtil jdbcUtil = new JdbcUtil();

        ResultSet resultSet = jdbcUtil.executeQuery(sql, eid);

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
}
