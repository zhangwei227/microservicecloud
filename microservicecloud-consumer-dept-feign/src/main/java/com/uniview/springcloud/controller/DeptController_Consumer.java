package com.uniview.springcloud.controller;

import com.uniview.springcloud.entities.Dept;
import com.uniview.springcloud.service.DeptClientService;
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

    @Autowired
    private DeptClientService service;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return service.add(dept);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/consumer/dept/get/list")
    public List<Dept> list() {
        return service.list();
    }

}