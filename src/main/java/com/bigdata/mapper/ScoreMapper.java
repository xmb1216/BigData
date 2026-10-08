package com.bigdata.mapper;

import com.bigdata.entity.Score;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ScoreMapper {
    // 按考试+班级+科目查询成绩明细（关联学生姓名）
    @MapKey("student_name")
    List<Map<String, Object>> findByCondition(@Param("examId") Integer examId,
                                              @Param("classId") Integer classId,
                                              @Param("courseId") Integer courseId);

    // 班级单科统计：平均分、最高分、最低分、及格率

    // 正确：单条聚合结果，返回单层Map，key是列名，value是对应的值
    Map<String, Object> statClassCourse(Integer examId, Integer classId, Integer courseId);

    // 学生总分排名
    @MapKey("student_id")
    List<Map<String, Object>> getStudentTotalRank(@Param("examId") Integer examId,
                                                  @Param("classId") Integer classId);

    // 新增成绩
    int insert(Score score);

    // 修改成绩
    int update(Score score);

    // 删除成绩
    int deleteById(Long id);
}