package com.microservices.apiGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceCallBack")
    public String userServiceCallBackMethod(){
        return "User service is taking time longer than expected";
    }

    @GetMapping("/departmentServiceCallBack")
    public String departmentServiceCallBackMethod(){
        return "department service is taking time longer than expected";
    }
}
