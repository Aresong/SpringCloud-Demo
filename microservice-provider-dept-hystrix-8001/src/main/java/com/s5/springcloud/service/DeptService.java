package com.s5.springcloud.service;

import com.s5.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author: Aresong
 * @Date: 2019/7/24 22:56
 * @Version 1.0
 */
public interface DeptService {
    /**
     * 插入
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    Dept findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<Dept> findAll();
}
