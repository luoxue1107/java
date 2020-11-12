package cn.kgc.tangcco.dao;

import cn.kgc.tangcco.pojo.Author;
import cn.kgc.tangcco.pojo.Journalism;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 11:51
 */
public interface AuthorDao {
    List<Author> selectAllAuthor(Integer initial, Integer length);
    List<Author> selectAllAuthor();
    Integer insertAuthor( Author author);
    Integer deleteAuthor(Integer id);
    Integer updateAuthor(Author author);
    Author selectAuthorById(Integer id);
}
