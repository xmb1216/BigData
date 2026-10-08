package com.bigdata.mapper;

import com.bigdata.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> findAll();

    // 按班级查询学生
    List<Student> findByClassId(Integer classId);

    Student findById(Integer id);

    int insert(Student student);

    int update(Student student);

    int deleteById(Integer id);
}