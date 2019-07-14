package com.uniview.springcloud.controller;

import com.uniview.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Wei.Zhang
 * @date 2019-07-13 17:09
 **/
@RestController
public class DeptController_Consumer {

    // private final static String REST_URL_REFFIX = "http://localhost:8081";
    private final static String REST_URL_REFFIX = "http://MICROSERVICE-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_REFFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return restTemplate.getForObject(REST_URL_REFFIX + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/consumer/dept/get/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_REFFIX + "/dept/list", List.class);
    }

}