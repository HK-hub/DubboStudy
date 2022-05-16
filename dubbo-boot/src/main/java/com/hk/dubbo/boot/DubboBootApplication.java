package com.hk.dubbo.boot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboBootApplication.class, args);
    }

}
