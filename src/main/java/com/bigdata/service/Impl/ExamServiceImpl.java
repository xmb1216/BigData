package com.bigdata.service.Impl;

import com.bigdata.entity.Exam;
import com.bigdata.mapper.ExamMapper;
import com.bigdata.service.ExamService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Resource
    private ExamMapper examMapper;

    @Override
    public List<Exam> findAll() {
        return examMapper.findAll();
    }

    @Override
    public List<Exam> findBySchoolYear(String schoolYear) {
        return examMapper.findBySchoolYear(schoolYear);
    }

    @Override
    public Exam findById(Integer id) {
        return examMapper.findById(id);
    }

    @Override
    public int add(Exam exam) {
        return examMapper.insert(exam);
    }

    @Override
    public int update(Exam exam) {
        return examMapper.update(exam);
    }

    @Override
    public int deleteById(Integer id) {
        return examMapper.deleteById(id);
    }
}