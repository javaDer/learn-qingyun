package com.wwjswly.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jack
 */
@SpringBootApplication
@MapperScan("com.wwjswly.learn.mapper")
@EnableSwagger2
public class LearnSendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSendApplication.class, args);
    }

}

