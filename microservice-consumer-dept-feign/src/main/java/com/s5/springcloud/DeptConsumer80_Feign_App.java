package com.s5.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Aresong
 * @Date: 2019/7/25 22:17
 * @Version 1.0
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.s5.springcloud"})
@ComponentScan("com.s5.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }

}
