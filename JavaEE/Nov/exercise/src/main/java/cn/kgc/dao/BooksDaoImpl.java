package cn.kgc.dao;

import cn.kgc.pojo.Book;
import cn.kgc.pojo.Clazz;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/20 17:08
 */
@Repository
public class BooksDaoImpl implements BooksDao{
    private Clazz clazz;

    @Override
    public List<Book> selectBooks() {
        return clazz.getBookList();
    }
}
