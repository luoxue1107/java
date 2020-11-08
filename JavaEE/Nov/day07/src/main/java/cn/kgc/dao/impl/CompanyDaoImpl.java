package cn.kgc.dao.impl;

import cn.kgc.dao.CompanyDao;
import cn.kgc.pojo.Company;
import cn.kgc.util.jdbc.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/7 14:15
 */
public class CompanyDaoImpl implements CompanyDao {

    @Override
    public Integer insertCompany(Company company) {
        JdbcUtil jdbcUtil= new JdbcUtil();
        Integer integer = jdbcUtil.executeUpdate("insert into  company(name) values (?)");
        jdbcUtil.close();
        return integer;
    }

    @Override
    public List<Company> selectCompany() {
        JdbcUtil jdbcUtil= new JdbcUtil();
        List<Company> list = new ArrayList<Company>();
        String sql="select * from company";
        ResultSet resultSet = jdbcUtil.executeQuery(sql);
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                list.add(new Company(id,name ));
            }
            return list;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            jdbcUtil.close();
        }
        return null;
    }

    @Override
    public Integer deleteCompany(Integer id) {
        JdbcUtil jdbcUtil =new JdbcUtil();
        Integer integer = jdbcUtil.executeUpdate("delete from company where id = ?");
        jdbcUtil.close();
        return integer;
    }

    @Override
    public Integer updateCompany(Company company) {
        JdbcUtil jdbcUtil = new JdbcUtil();
        Integer integer = jdbcUtil.executeUpdate("update company set name = ? where id = ?", company.getId(), company.getName());
        jdbcUtil.close();
        return integer;
    }
}
