package com.bigdata.entity;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Course {
    private Integer id;
    private String courseName;
    private BigDecimal fullScore;
    private BigDecimal passScore;
    private LocalDateTime createTime;
}