package com.example.microservices.userService.service;

import com.example.microservices.userService.VO.Department;
import com.example.microservices.userService.VO.ResponseTemplateVO;
import com.example.microservices.userService.entity.User;
import com.example.microservices.userService.repository.UserRepository;
import com.sun.deploy.nativesandbox.comm.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                Department.class);
        vo.setDepartment(department);
        vo.setUser(user);
        return vo;
    }
}
