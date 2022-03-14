package com.study.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.domian.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//public class BookServiceTestCase {
//
//    public BookService bookService;
//    @Test
//    void testGetById(){
//        System.out.println(bookService.getById(2));
//    }
//
//    @Test
//    void testSave(){
//        Book book = new Book();
//        book.setType("测试数据123");
//        book.setName("测试数据123");
//        book.setDescription("测试数据123");
//        System.out.println(bookService.save(book));
//    }
//
//    @Test
//    void testUpdate(){
//        Book book = new Book();
//        book.setId(17);
//        book.setType("测试数据abcdefg");
//        book.setName("测试数据123");
//        book.setDescription("测试数据123");
//        System.out.println(bookService.update(book));
//    }
//
//    @Test
//    void testDelete(){
//        System.out.println(bookService.delete(16));
//    }
//
//    @Test
//    void testGetAll(){
//        System.out.println(bookService.getAll());
//    }
//    @Test
//    void testGetPage(){
//
//        System.out.println(bookService.getPage(2,4));
////        IPage page = new Page(2,5);
////        bookDao.selectPage(page, null);
////        System.out.println(page.getCurrent());
////        System.out.println(page.getSize());
////        System.out.println(page.getTotal());
////        System.out.println(page.getPages());
////        System.out.println(page.getRecords());
//    }
//
//}
@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(2));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(17);
        book.setType("-----------------");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.update(book);
    }
    @Test
    void testDelete(){
        bookService.delete(18);
    }

    @Test
    void testGetAll(){
        bookService.getAll();
    }

    @Test
    void testGetPage(){
        System.out.println(bookService.getPage(2,4));
    }

}