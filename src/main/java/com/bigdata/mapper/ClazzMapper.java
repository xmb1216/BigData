package com.bigdata.mapper;

import com.bigdata.entity.Clazz;
import java.util.List;

public interface ClazzMapper {
    List<Clazz> findAll();

    Clazz findById(Integer id);

    int insert(Clazz clazz);

    int update(Clazz clazz);

    int deleteById(Integer id);
}