package com.study.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.study.domian.Book;
import com.study.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    public IBookService iBookService;

    @GetMapping
    public List<Book> getAll(){
        return iBookService.list();
    }
    @PostMapping
    public Boolean save(@RequestBody Book book){
        System.out.println("....");
        return iBookService.save(book);
    }
    @PutMapping
    public Boolean update(@RequestBody Book book){
        return iBookService.modify(book);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return iBookService.delete(id);
    }
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return iBookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return iBookService.getPage(currentPage,pageSize);
    }
}
