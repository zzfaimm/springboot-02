package com.study.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.domian.Book;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BookDao extends BaseMapper<Book> {

}
