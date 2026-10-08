package com.bigdata.service;

import com.bigdata.entity.Course;
import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(Integer id);
    int add(Course course);
    int update(Course course);
    int deleteById(Integer id);
}