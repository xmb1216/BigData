package com.bigdata;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
@MapperScan("com.bigdata.mapper")
@SpringBootTest
class BigDataApplicationTests {

    @Test
    void contextLoads() {
    }

}
