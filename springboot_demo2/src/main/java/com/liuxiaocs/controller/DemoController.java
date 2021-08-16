package com.liuxiaocs.controller;

import com.liuxiaocs.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用来测试对象创建
 */
@RestController
public class DemoController {

    @Autowired  // 默认根据类型注入
    @Qualifier(value = "demoService")  // 作用：用来修改autowired默认不再根据类型注入 修改为根据名称注入
    private DemoService demoService;

    @RequestMapping("demo")
    public String demo() {
        System.out.println("demo ok");
        demoService.demo();
        return "demo ok";
    }
}
