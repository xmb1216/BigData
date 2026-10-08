package com.bigdata.service.Impl;

import com.bigdata.entity.Clazz;
import com.bigdata.mapper.ClazzMapper;
import com.bigdata.service.ClazzService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Resource
    private ClazzMapper clazzMapper;

    @Override
    public List<Clazz> findAll() {
        return clazzMapper.findAll();
    }

    @Override
    public Clazz findById(Integer id) {
        return clazzMapper.findById(id);
    }

    @Override
    public int add(Clazz clazz) {
        return clazzMapper.insert(clazz);
    }

    @Override
    public int update(Clazz clazz) {
        return clazzMapper.update(clazz);
    }

    @Override
    public int deleteById(Integer id) {
        return clazzMapper.deleteById(id);
    }
}