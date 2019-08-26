package com.s5.springcloud.service;

import com.s5.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Aresong
 * @Date: 2019/8/12 21:44
 * @Version 1.0
 */

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id).setDeptName("该id："+id+"没有对应信息,null--@HystrixCommand").setDbSource("no database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
