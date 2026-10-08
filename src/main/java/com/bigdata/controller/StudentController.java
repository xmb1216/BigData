package com.bigdata.controller;

import com.bigdata.entity.Student;
import com.bigdata.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 查询全部学生列表
     */
    @GetMapping("/list")
    public List<Student> list() {
        return studentService.findAll();
    }

    /**
     * 按班级查询学生列表
     */
    @GetMapping("/class/{classId}")
    public List<Student> getByClassId(@PathVariable Integer classId) {
        return studentService.findByClassId(classId);
    }

    /**
     * 根据ID查询学生
     */
    @GetMapping("/{id}")
    public Student getById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    /**
     * 新增学生
     */
    @PostMapping("/add")
    public Integer add(Student student) {
        return studentService.add(student);
    }

    /**
     * 修改学生信息
     */
    @PostMapping("/update")
    public Integer update(Student student) {
        return studentService.update(student);
    }

    /**
     * 删除学生
     */
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return studentService.deleteById(id);
    }
}