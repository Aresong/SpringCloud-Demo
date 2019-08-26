package com.s5.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Aresong
 * @Date: 2019/8/2 22:41
 * @Version 1.0
 */

@Configuration
public class MyRule {

    @Bean
    public IRule roundRobinRule_5(){
        return new RoundRobinRule_5();//默认轮询，自定义每台机器轮询5次
    }

}
