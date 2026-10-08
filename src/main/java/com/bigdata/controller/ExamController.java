package com.bigdata.controller;

import com.bigdata.entity.Exam;
import com.bigdata.service.ExamService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam")
@CrossOrigin
public class ExamController {

    @Resource
    private ExamService examService;

    /**
     * 查询全部考试列表
     */
    @GetMapping("/list")
    public List<Exam> list() {
        return examService.findAll();
    }

    /**
     * 按学年筛选考试
     */
    @GetMapping("/year/{schoolYear}")
    public List<Exam> getBySchoolYear(@PathVariable String schoolYear) {
        return examService.findBySchoolYear(schoolYear);
    }

    /**
     * 根据ID查询考试
     */
    @GetMapping("/{id}")
    public Exam getById(@PathVariable Integer id) {
        return examService.findById(id);
    }

    /**
     * 新增考试
     */
    @PostMapping("/add")
    public Integer add(Exam exam) {
        return examService.add(exam);
    }

    /**
     * 修改考试信息
     */
    @PostMapping("/update")
    public Integer update(Exam exam) {
        return examService.update(exam);
    }

    /**
     * 删除考试
     */
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return examService.deleteById(id);
    }
}