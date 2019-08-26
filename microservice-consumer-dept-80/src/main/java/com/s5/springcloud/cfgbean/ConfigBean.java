package com.s5.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Aresong
 * @Date: 2019/7/25 21:47
 * @Version 1.0
 */

@Configuration
public class ConfigBean {//spring-->boot  applicationContext.xml --> @@Configuration

    @Bean
    @LoadBalanced //SpringCloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //这个地方可以有7个，自己上网查
        return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询
    }

}
