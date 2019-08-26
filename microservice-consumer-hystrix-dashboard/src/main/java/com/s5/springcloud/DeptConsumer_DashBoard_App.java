package com.s5.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: Aresong
 * @Date: 2019/7/24 23:12
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args){
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }

}
