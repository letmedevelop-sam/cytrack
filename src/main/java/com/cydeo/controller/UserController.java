package com.cydeo.controller;

import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/adminList")
    public String adminList(){
        return "user/admin-list";
    }

    @GetMapping("/instructorList")
    public String instructorList(){
        return "user/instructor-list";
    }


}
