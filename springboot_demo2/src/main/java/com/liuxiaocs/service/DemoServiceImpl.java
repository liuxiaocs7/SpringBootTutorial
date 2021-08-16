package com.liuxiaocs.service;

import org.springframework.stereotype.Service;

@Service("demoService")  // 修饰范围：用在类上  作用：在工厂中创建对象  默认：工厂中名称为类名首字母小写 DemoServiceImpl。value属性：用来指定当前创建对象在工厂中的名称
public class DemoServiceImpl implements DemoService {

    @Override
    public void demo() {
        System.out.println("demo service");
    }
}
