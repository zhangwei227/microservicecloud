package com.uniview.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8083_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8083_App.class, args);
    }

}
