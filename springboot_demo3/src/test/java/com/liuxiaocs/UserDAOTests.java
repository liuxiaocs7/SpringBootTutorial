package com.liuxiaocs;

import com.liuxiaocs.dao.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAOTests extends BasicTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testFindAll() {
        userDAO.findAll().forEach(user -> System.out.println(user.getName()));
    }
}
