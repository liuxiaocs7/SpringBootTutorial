package com.liuxiaocs.service;

import com.liuxiaocs.entity.Emp;

import java.util.List;

public interface EmpService {

    void save(Emp emp);

    List<Emp> findALl();

}
