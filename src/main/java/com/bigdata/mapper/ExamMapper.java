package com.bigdata.mapper;

import com.bigdata.entity.Exam;
import java.util.List;

public interface ExamMapper {
    List<Exam> findAll();

    // 按学年查询
    List<Exam> findBySchoolYear(String schoolYear);

    Exam findById(Integer id);

    int insert(Exam exam);

    int update(Exam exam);

    int deleteById(Integer id);
}