package com.bigdata.service;

import com.bigdata.entity.Exam;
import java.util.List;

public interface ExamService {
    List<Exam> findAll();
    List<Exam> findBySchoolYear(String schoolYear);
    Exam findById(Integer id);
    int add(Exam exam);
    int update(Exam exam);
    int deleteById(Integer id);
}