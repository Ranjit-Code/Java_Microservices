package com.example.microservices.departmentServiceMod.service;

import com.example.microservices.departmentServiceMod.entity.Department;
import com.example.microservices.departmentServiceMod.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public  Department saveDepartment(Department department){
        log.info("in saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId){
        log.info("in findDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
