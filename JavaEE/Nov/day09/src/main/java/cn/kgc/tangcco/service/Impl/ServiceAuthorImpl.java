package cn.kgc.tangcco.service.Impl;

import cn.kgc.tangcco.dao.Impl.AuthorDaoImpl;
import cn.kgc.tangcco.pojo.Author;
import cn.kgc.tangcco.service.ServiceAuthor;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 15:36
 */
public class ServiceAuthorImpl implements ServiceAuthor {
    AuthorDaoImpl authorDaoImpl= new AuthorDaoImpl();
    @Override
    public List<Author> getAuthor() {
        return authorDaoImpl.selectAllAuthor();
    }
}
