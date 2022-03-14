package com.study.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.study.domian.Book;
import java.util.List;


//public interface BookService {
//    boolean save(Book book);
//    boolean update(Book book);
//    boolean delete(Integer id);
//    Book getById(Integer id);
//    List<Book> getAll();
//    IPage<Book> getPage(int currentPage, int pageSize);
//        Boolean save(Book book);
//        Boolean update(Book book);
//        Boolean delete(Integer id);
//        Book getById(Integer id);
//        List<Book> getAll();
//        IPage<Book> getPage(int currentPage, int pageSize);
//
//}
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage,int pageSize);
}
