package com.example.microservices.departmentServiceMod.controller;

import com.example.microservices.departmentServiceMod.entity.Department;
import com.example.microservices.departmentServiceMod.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("in saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        log.info("in findDepartmentById of DepartmentController");
        return departmentService.findByDepartmentId(departmentId);
    }
}
