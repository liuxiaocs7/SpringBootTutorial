package com.liuxiaocs.test;

import com.liuxiaocs.entity.Emp;
import com.liuxiaocs.service.EmpService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestEmpServiceImpl {
    public static void main(String[] args) {
        // 1. 运行工厂
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // 2. 从工厂中获取对象
        EmpService empService = (EmpService) context.getBean("empServiceImpl");

        empService.save(new Emp(null, "小陈", new Date(), 23.23));

        // 3. 调用方法
        empService.findALl().forEach(emp -> System.out.println(emp));
    }
}
