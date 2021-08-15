package com.liuxiaocs.service;

import com.liuxiaocs.dao.EmpDAO;
import com.liuxiaocs.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    private EmpDAO empDAO;

    /**
     * 推荐使用构造注入
     */
    @Autowired
    public EmpServiceImpl(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    @Override
    public void save(Emp emp) {
        empDAO.save(emp);
    }

    @Override
    public List<Emp> findALl() {
        return empDAO.findAll();
    }
}
