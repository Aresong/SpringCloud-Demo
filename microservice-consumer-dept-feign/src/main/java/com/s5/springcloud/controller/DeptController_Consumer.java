package com.s5.springcloud.controller;

import com.s5.springcloud.entities.Dept;
import com.s5.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Aresong
 * @Date: 2019/7/25 22:01
 * @Version 1.0
 */

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }

    @GetMapping("/consumer/dept/discovery")
    public Object discovery(){
        return  discovery();
    }

}
