package com.wwjswly.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jack
 */
@SpringBootApplication
@MapperScan("com.wwjswly.learn.mapper")
public class LearnRecelverApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnRecelverApplication.class, args);
    }

}

