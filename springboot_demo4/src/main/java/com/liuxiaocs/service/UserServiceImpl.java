package com.liuxiaocs.service;

import com.liuxiaocs.dao.UserDAO;
import com.liuxiaocs.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    // 声明一个日志对象
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void save(User user) {
        // 1. 拼接
        // log.debug("姓名：" + user.getName());
        // 2. 占位符
        log.debug("姓名：{}===>{}===>{}", user.getName(), "参数1", "参数2");
        log.debug("工资：{}", user.getSalary());
        log.debug("生日：" + user.getBirthday());
        userDAO.save(user);
    }
}
