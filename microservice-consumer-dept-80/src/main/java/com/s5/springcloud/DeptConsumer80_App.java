package com.s5.springcloud;

import com.s5.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: Aresong
 * @Date: 2019/7/25 22:17
 * @Version 1.0
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="microservice-dept",configuration = MyRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_App.class,args);
    }

}
