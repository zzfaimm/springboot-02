package com.study.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.study.domian.Book;
import com.study.service.IBookService;
import com.study.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    public IBookService iBookService;

    @GetMapping
    public R getAll(){
        return new R(true,iBookService.list());
    }
    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        boolean flag = iBookService.save(book);
        return new R(flag,flag ? "添加成功^_^" : "添加失败-_-");
    }
    @PutMapping
    public R update(@RequestBody Book book){

        return new R(iBookService.modify(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){

        return new R(iBookService.delete(id));
    }
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        System.out.println("热部署。。。");
        System.out.println("热部署。。。");
        System.out.println("热部署。。。");

        return new R(true,iBookService.getById(id));

    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize,Book book){
        IPage<Book> page = iBookService.getPage(currentPage, pageSize,book);
        if (currentPage > page.getPages()){
            page = iBookService.getPage((int)page.getPages(),pageSize,book);
        }
        return new R(true,page);
    }
}
