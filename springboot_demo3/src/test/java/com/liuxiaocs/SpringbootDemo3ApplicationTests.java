package com.liuxiaocs;

import com.liuxiaocs.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo3ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        userService.findAll().forEach(user -> System.out.println(user.getName()));
    }
}
