package com.s5.springcloud.service.impl;

import com.s5.springcloud.entities.Dept;
import com.s5.springcloud.dao.DeptDao;
import com.s5.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Aresong
 * @Date: 2019/7/24 22:57
 * @Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return  deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long deptNo) {
        return  deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
