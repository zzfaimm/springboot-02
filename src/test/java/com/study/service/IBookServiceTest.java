package com.study.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTest {
    @Autowired
    public IBookService iBookService;
    @Test
    public void  test(){
        System.out.println(iBookService.getById(2));
    }
}
