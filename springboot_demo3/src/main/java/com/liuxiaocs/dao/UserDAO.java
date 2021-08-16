package com.liuxiaocs.dao;

import com.liuxiaocs.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// @Mapper  // 只能创建单个DAO对象
public interface UserDAO {

    // 查询所有
    List<User> findAll();

    // 保存用户信息
    void save(User user);
}
