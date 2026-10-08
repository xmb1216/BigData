package com.bigdata.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Score {
    private Long id;
    private Integer examId;
    private Integer studentId;
    private Integer courseId;
    private Integer classId;
    private BigDecimal score;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}