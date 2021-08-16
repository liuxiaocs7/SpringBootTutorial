package com.liuxiaocs.controller;

import com.liuxiaocs.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * 用来测试对象创建
 */
@RestController
public class DemoController {

    @Autowired  // 默认根据类型注入
    @Qualifier(value = "demoService")  // 作用：用来修改autowired默认不再根据类型注入 修改为根据名称注入
    private DemoService demoService;

    // 直接注入
    @Autowired
    @Qualifier("calendar")
    private Calendar calendar;

    @RequestMapping("demo")
    public String demo() {
        System.out.println("demo ok");
        demoService.demo();

        // 日历类，无法添加@Component注解，通过配置的方式创建出来
        // Calendar instance = Calendar.getInstance();
        // System.out.println("当前日期：" + instance.getTime());

        System.out.println("工厂中获取日历对象，当前时间为：" + calendar.getTime());

        return "demo ok";
    }
}
