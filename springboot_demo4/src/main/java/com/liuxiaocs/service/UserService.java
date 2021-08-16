package com.liuxiaocs.service;

import com.liuxiaocs.entity.User;

import java.util.List;

public interface UserService {

    // 查询所有
    List<User> findAll();

    // 保存用户信息
    void save(User user);
}
