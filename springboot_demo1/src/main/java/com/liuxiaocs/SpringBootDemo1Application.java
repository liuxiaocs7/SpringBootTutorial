package com.liuxiaocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 这个注解：修饰范围：用在类上 只能用在入口类上，只能出现一次
// 作用：标识这个类是一个SpringBoot的入口类，启动整个SpringBoot项目总入口
// 总结：1. pom文件引入依赖  2. resources生成application.yml   3.创建入口类加入@SpringBootApplication注解 在main中启动应用
// SpringBoot = SpringMVC(控制器Controller) + Spring工厂
// @SpringBootApplication注解：
//      组合注解：就是由多个注解组合而成的一个注解
//      元注解：修饰注解的注解  @Target: 指定注解的作用范围  @Retention: 指定注解什么时候有效
//
// @SpringBootConfiguration: 这个注解用来自动配置Spring SpringMVC(初始化Servlet，视图解析...)相关环境 (初始化环境)
// @EnableAutoConfiguration: 开启自动配置  自动配置核心注解 配置真正生效  自动配置Spring相关环境 引入第三方技术自动配置其环境
//                           mybatis-springboot、redis-springboot、es-springboot、rabbitmq 第三方技术
// @ComponentScan: 组件扫描  根据注解发挥注解作用 默认扫描当前包及其子包
//
// 启动 SpringBoot应用时候需要传递main函数参数作为启动的第二个参数：
// 测试用的，向程序传入一些JVM的参数
@SpringBootApplication
public class SpringBootDemo1Application {

    public static void main(String[] args) {
        // 启动SpringBoot应用 参数1：指定入口类的类对象 .class对象  参数2：main函数参数
        SpringApplication.run(SpringBootDemo1Application.class, args);
    }
}
