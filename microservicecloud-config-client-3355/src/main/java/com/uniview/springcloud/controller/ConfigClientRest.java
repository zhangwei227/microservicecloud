package com.uniview.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wei.Zhang
 * @date 2019-07-14 19:49
 **/
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        String str = "applicationName:" + applicationName + "\t eurekaServers:" + eurekaServers + "\t port:" + port;
        System.out.println("**************str:" + str);
        return str;
    }
}
