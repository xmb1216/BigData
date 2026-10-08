package com.bigdata.service;

import com.bigdata.entity.Clazz;
import java.util.List;

public interface ClazzService {
    List<Clazz> findAll();
    Clazz findById(Integer id);
    int add(Clazz clazz);
    int update(Clazz clazz);
    int deleteById(Integer id);
}