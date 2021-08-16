package com.liuxiaocs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Mapper  注解：修饰范围：只能放在DAO接口上  作用：用来在工厂中创建DAO对象
@MapperScan("com.liuxiaocs.dao")  // 修饰范围：用在类上  作用：用来扫描dao接口所在的包，同时将所有dao接口在工厂中创建对象
public class SpringbootDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo3Application.class, args);
    }

}
