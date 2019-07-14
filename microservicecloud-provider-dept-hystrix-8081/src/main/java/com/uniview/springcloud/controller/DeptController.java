package com.uniview.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable Long id) {
        Dept dept = deptService.findById(id);
        if (dept == null) {
            throw new RuntimeException("该ID：" + id + "没有相关信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有相关信息,null--@HystrixCommand").setDb_source("no this data in pgdatabase");
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.findAll();
    }

}
