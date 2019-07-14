package com.uniview.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Wei.Zhang
 * @date 2019-07-13 16:44
 **/
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8081_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8081_App.class, args);
    }

}
