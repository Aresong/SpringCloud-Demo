package com.s5.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Aresong
 * @Date: 2019/7/30 21:47
 * @Version 1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(Config_Git_EurekaServerApplication.class,args);
    }

}
