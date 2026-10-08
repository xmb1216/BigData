package com.bigdata.mapper;

import com.bigdata.entity.Course;
import java.util.List;

public interface CourseMapper {
    List<Course> findAll();

    Course findById(Integer id);

    int insert(Course course);

    int update(Course course);

    int deleteById(Integer id);
}