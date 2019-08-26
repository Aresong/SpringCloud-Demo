package com.s5.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.s5.springcloud.entities.Dept;
import com.s5.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Aresong
 * @Date: 2019/7/24 23:03
 * @Version 1.0
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    //一旦调用方法失败抛出了错误信息后，就会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = new Dept();
        if(null == dept){
            throw new RuntimeException("该ID："+id+"没有对应的信息");
        }
        return deptService.findById(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return deptService.findAll();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptNo(id).setDeptName("该id："+id+"没有对应信息,null--@HystrixCommand").setDbSource("no database in MySQL");
    }


}
