package com.s5.springcloud.service;

import com.s5.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author: Aresong
 * @Date: 2019/8/5 21:32
 * @Version 1.0
 */

@FeignClient(value = "microservice-dept",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();
}
