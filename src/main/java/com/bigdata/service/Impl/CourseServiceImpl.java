package com.bigdata.service.Impl;

import com.bigdata.entity.Course;
import com.bigdata.mapper.CourseMapper;
import com.bigdata.service.CourseService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public Course findById(Integer id) {
        return courseMapper.findById(id);
    }

    @Override
    public int add(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int update(Course course) {
        return courseMapper.update(course);
    }

    @Override
    public int deleteById(Integer id) {
        return courseMapper.deleteById(id);
    }
}