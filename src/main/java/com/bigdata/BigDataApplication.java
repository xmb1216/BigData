package com.bigdata;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.bigdata.mapper")
public class BigDataApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(BigDataApplication.class, args);
        // 关键打印
        try {
            DataSource ds = context.getBean(DataSource.class);
            System.out.println("✅ 数据源正常创建：" + ds.getClass());
        } catch (Exception e) {
            System.out.println("❌ 未找到DataSource，yml配置失效！");
            e.printStackTrace();
        }
    }
}
