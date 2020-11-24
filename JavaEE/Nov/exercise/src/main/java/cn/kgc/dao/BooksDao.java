package cn.kgc.dao;

import cn.kgc.pojo.Book;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/20 17:08
 */
public interface BooksDao {
    List<Book> selectBooks();
}
