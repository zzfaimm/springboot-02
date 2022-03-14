package com.study.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class projectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public R daOtherException(Exception ex){
        ex.printStackTrace();
        return new R(false,null,"系统错误，请稍后再试！");
    }
}
