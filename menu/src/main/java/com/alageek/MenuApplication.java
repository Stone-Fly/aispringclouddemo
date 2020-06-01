package com.alageek;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Method;

@SpringBootApplication
@MapperScan("com.alageek.repository")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
    }
}
