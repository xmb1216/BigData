package com.bigdata.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Student {
    private Integer id;
    private String studentNo;
    private String name;
    private String gender;
    private Integer age;
    private Integer classId;
    private Integer userId;
    private LocalDateTime createTime;
}
