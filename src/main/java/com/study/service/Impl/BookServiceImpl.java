package com.study.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.dao.BookDao;
import com.study.domian.Book;
import com.study.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//
//@Service
//public class BookServiceImpl implements BookService {
//
//    @Autowired
//    public BookDao bookDao;
//
//    @Override
//    public boolean save(Book book) {
//        return bookDao.insert(book) > 0;
//    }
//
//    @Override
//    public boolean update(Book book) {
//        return bookDao.updateById(book) > 0;
//    }
//
//    @Override
//    public boolean delete(Integer id) {
//        return bookDao.deleteById(id) > 0;
//    }
//
//    @Override
//    public Book getById(Integer id) {
//        return bookDao.selectById(id);
//    }
//
//    @Override
//    public List<Book> getAll() {
//        return bookDao.selectList(null);
//    }
//
//    @Override
//    public IPage<Book> getPage(int currentPage, int pageSize) {
//        IPage<Book> page = new Page<>(currentPage,pageSize);
//        bookDao.selectPage(page,null);
//        return page;
//    }
//}
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        bookDao.selectPage(page,null);
        return page;
    }
}