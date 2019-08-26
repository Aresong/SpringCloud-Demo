package com.s5.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Aresong
 * @Date: 2019/8/21 23:01
 * @Version 1.0
 */

@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args){
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }

}
