package cn.kgc.tangcco.dao.Impl;

import cn.kgc.tangcco.dao.AuthorDao;
import cn.kgc.tangcco.pojo.Author;
import cn.kgc.tangcco.util.jdbc.JDBCUtil;
import com.alibaba.fastjson.JSON;

import java.sql.*;
import java.util.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 12:00
 */
public class AuthorDaoImpl implements AuthorDao {
    @Override
    public List<Author> selectAllAuthor(Integer initial, Integer length) {
        return null;
    }

    @Override
    public List<Author> selectAllAuthor() {
        JDBCUtil jdbcUtil =new JDBCUtil();
        List<Author> list= new ArrayList<>();
        String sql ="select * from author";
        ResultSet resultSet = jdbcUtil.executeQuery(sql);
        try {
            while (resultSet.next()){
                list.add(new Author(resultSet.getInt("id"),resultSet.getString("name")));
            }
            list.forEach(author -> System.out.println(JSON.toJSONString(author)));
            return  list;
        }catch (Throwable e) {
            e.printStackTrace();
        }finally {
            jdbcUtil.close();
        }
        return null;
    }

    @Override
    public Integer insertAuthor(Author author) {
        return null;
    }

    @Override
    public Integer deleteAuthor(Integer id) {
        return null;
    }

    @Override
    public Integer updateAuthor(Author author) {
        return null;
    }

    @Override
    public Author selectAuthorById(Integer id) {
        return null;
    }
}
