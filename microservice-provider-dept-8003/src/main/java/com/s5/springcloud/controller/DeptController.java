package com.s5.springcloud.controller;

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
    @Autowired
    private DiscoveryClient client;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return deptService.findAll();
    }


    /**
     * 对于注册进eureka里面的微服务，可以通过服务发现来获得该服务的信息
     * 需要在主启动类添加 @EnableDiscoveryClient 注解（实测不添加也行？）
     * **/
    @GetMapping(value = "/dept/discovery")
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("总共有多少个微服务"+list.size());

        //查询microservice-dept8001 服务
        List<ServiceInstance> instances = client.getInstances("microservice-dept8001");

        //打印microservice-dept8001服务信息
        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.client;

    }

}
