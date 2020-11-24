package cn.kgc.pojo;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/20 17:26
 */
public class Clazz {
    private List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Clazz(List<Book> bookList) {
        this.bookList = bookList;
    }
}
