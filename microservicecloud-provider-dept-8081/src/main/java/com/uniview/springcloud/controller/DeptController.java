package com.uniview.springcloud.controller;

import com.netflix.discovery.DiscoveryClient;
import com.uniview.springcloud.entities.Dept;
import com.uniview.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wei.Zhang
 * @date 2019-07-13 16:39
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return deptService.findById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.findAll();
    }

}
