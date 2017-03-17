package com.jorgehernandezramirez.spring.springcloud.backend.controller;

import com.jorgehernandezramirez.spring.springcloud.backend.service.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    public UserController(){
        //For Spring
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> getUsers() {
        return Arrays.asList(new UserDto("1", "admin", "admin"),
                new UserDto("2", "jorge", "hernandez"));
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public List<UserDto> getUserAdmins() {
        return Arrays.asList(new UserDto("1", "admin", "admin"));
    }
}