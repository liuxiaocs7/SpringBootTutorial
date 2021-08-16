package com.liuxiaocs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liuxiaocs.dao")
public class SpringbootDemo4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo4Application.class, args);
    }

}
