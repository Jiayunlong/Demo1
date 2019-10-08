package com.example.demo.controller;

import com.example.demo.bean.Department;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.service.DepartmentService;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepartmentController {

    @Autowired
    public DepartmentService departmentService;

    @GetMapping("/dep/{id}")
    @ResponseBody
    public Department getDepartment(@PathVariable("id") Integer id) {
        Department departmentById = departmentService.getById(id);
        return departmentById;
    }

    @GetMapping("/dep/update")
    @ResponseBody
    public Department update(Department department) {
        Department updateDep = departmentService.updateDep(department);
        return updateDep;
    }
}
