package com.axtx.myspringbootproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.axtx.myspringbootproject.mapper")
public class MyspringbootprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootprojectApplication.class, args);
    }

}
