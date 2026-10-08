package com.bigdata.service.Impl;

import com.bigdata.entity.Score;
import com.bigdata.mapper.ScoreMapper;
import com.bigdata.service.ScoreService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public List<Map<String, Object>> findByCondition(Integer examId, Integer classId, Integer courseId) {
        return scoreMapper.findByCondition(examId, classId, courseId);
    }

    @Override
    public Map<String, Object> statClassCourse(Integer examId, Integer classId, Integer courseId) {
        // 单层 Map 的 key 都是字符串（列名），Jackson 序列化完全正常
        return scoreMapper.statClassCourse(examId, classId, courseId);
    }

    @Override
    public List<Map<String, Object>> getStudentTotalRank(Integer examId, Integer classId) {
        return scoreMapper.getStudentTotalRank(examId, classId);
    }

    @Override
    public int add(Score score) {
        return scoreMapper.insert(score);
    }

    @Override
    public int update(Score score) {
        return scoreMapper.update(score);
    }

    @Override
    public int deleteById(Long id) {
        return scoreMapper.deleteById(id);
    }
}