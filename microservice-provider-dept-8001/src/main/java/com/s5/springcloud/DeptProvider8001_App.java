package com.s5.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Aresong
 * @Date: 2019/7/24 23:12
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8001_App {

    public static void main(String[] args){
        SpringApplication.run(DeptProvider8001_App.class,args);
    }

}
