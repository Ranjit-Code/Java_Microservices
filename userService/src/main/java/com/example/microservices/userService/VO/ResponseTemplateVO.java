package com.example.microservices.userService.VO;

import com.example.microservices.userService.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    @Autowired
    private User user;

    @Autowired
    private Department department;
}
