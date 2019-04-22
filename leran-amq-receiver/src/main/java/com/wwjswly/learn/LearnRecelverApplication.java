package com.wwjswly.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jack
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableSwagger2
@EnableDiscoveryClient
@MapperScan("com.wwjswly.learn.mapper")
@EnableFeignClients
@EnableHystrixDashboard
public class LearnRecelverApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnRecelverApplication.class, args);
    }

}

