package com.liuxiaocs;

import com.liuxiaocs.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceTests extends BasicTests {

    @Autowired
    private UserService userService;

    // 测试查询所有
    @Test
    public void testFindAll() {
        userService.findAll().forEach(user -> System.out.println(user.getName()));
    }
}
