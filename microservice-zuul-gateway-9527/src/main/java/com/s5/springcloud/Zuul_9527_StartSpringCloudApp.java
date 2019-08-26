package com.s5.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: Aresong
 * @Date: 2019/7/24 23:12
 * @Version 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {

    public static void main(String[] args){
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class,args);
    }

}
