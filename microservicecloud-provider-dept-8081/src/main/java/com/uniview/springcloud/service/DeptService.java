package com.uniview.springcloud.service;

import com.uniview.springcloud.entities.Dept;

import java.util.List;

/**
 * @author Wei.Zhang
 * @date 2019-07-13 16:36
 **/
public interface DeptService {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
