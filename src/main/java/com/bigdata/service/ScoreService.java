package com.bigdata.service;

import com.bigdata.entity.Score;
import java.util.List;
import java.util.Map;

public interface ScoreService {
    /**
     * 按条件查询成绩明细
     */
    List<Map<String, Object>> findByCondition(Integer examId, Integer classId, Integer courseId);

    /**
     * 班级单科统计
     */
    Map<String, Object> statClassCourse(Integer examId, Integer classId, Integer courseId);

    /**
     * 学生总分排名
     */
    List<Map<String, Object>> getStudentTotalRank(Integer examId, Integer classId);

    /**
     * 新增成绩
     */
    int add(Score score);

    /**
     * 修改成绩
     */
    int update(Score score);

    /**
     * 删除成绩
     */
    int deleteById(Long id);
}