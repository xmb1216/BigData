package com.bigdata.entity;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Exam {
    private Integer id;
    private String schoolYear;
    private Integer term;
    private String examName;
    private LocalDate examDate;
    private LocalDateTime createTime;
}