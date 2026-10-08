package com.bigdata.controller;

import com.bigdata.entity.Course;
import com.bigdata.service.CourseService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@CrossOrigin
public class CourseController {

    @Resource
    private CourseService courseService;

    /**
     * 查询全部课程列表
     */
    @GetMapping("/list")
    public List<Course> list() {
        return courseService.findAll();
    }

    /**
     * 根据ID查询课程
     */
    @GetMapping("/{id}")
    public Course getById(@PathVariable Integer id) {
        return courseService.findById(id);
    }

    /**
     * 新增课程
     */
    @PostMapping("/add")
    public Integer add(Course course) {
        return courseService.add(course);
    }

    /**
     * 修改课程信息
     */
    @PostMapping("/update")
    public Integer update(Course course) {
        return courseService.update(course);
    }

    /**
     * 删除课程
     */
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return courseService.deleteById(id);
    }
}