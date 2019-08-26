package com.s5.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 /**
 * @Author: Aresong
 * @Date: 2019/8/26 21:58
 * @Version 1.0
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
     private String eurekaServers;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){

        System.out.println("applicationName:"+this.applicationName
                +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port);
        return "applicationName:"+this.applicationName
                +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port;
    }
}