package com.bigdata.service;

import com.bigdata.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
    List<Student> findByClassId(Integer classId);
    Student findById(Integer id);
    int add(Student student);
    int update(Student student);
    int deleteById(Integer id);
}