package com.bigdata.entity;


import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Clazz {
    private Integer id;
    private Integer gradeYear;
    private String className;
    private LocalDateTime createTime;
}