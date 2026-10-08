package com.bigdata.controller;

import com.bigdata.entity.Score;
import com.bigdata.service.ScoreService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/score")
@CrossOrigin
public class ScoreController {

    @Resource
    private ScoreService scoreService;

    /**
     * 按条件查询成绩明细
     * 参数：考试ID、班级ID、课程ID
     */
    @GetMapping("/list")
    public List<Map<String, Object>> list(Integer examId, Integer classId, Integer courseId) {
        return scoreService.findByCondition(examId, classId, courseId);
    }

    /**
     * 班级单科成绩统计
     * 返回：平均分、最高分、最低分、及格率
     */
    @GetMapping("/stat/class")
    public Map<String, Object> statClassCourse(Integer examId, Integer classId, Integer courseId) {
        return scoreService.statClassCourse(examId, classId, courseId);
    }

    /**
     * 学生总分排名
     */
    @GetMapping("/rank/total")
    public List<Map<String, Object>> getTotalRank(Integer examId, Integer classId) {
        return scoreService.getStudentTotalRank(examId, classId);
    }

    /**
     * 新增成绩
     */
    @PostMapping("/add")
    public Integer add(Score score) {
        return scoreService.add(score);
    }

    /**
     * 修改成绩
     */
    @PostMapping("/update")
    public Integer update(Score score) {
        return scoreService.update(score);
    }

    /**
     * 删除成绩
     */
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Long id) {
        return scoreService.deleteById(id);
    }
}