package com.cydeo.controller;

import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String adminList(Model model){
        model.addAttribute("admins", userService.listAllUserByRole("Admin"));
        return "user/admin-list";
    }

    @GetMapping("/instructorList")
    public String instructorList(Model model){

        model.addAttribute("instructors", userService.listAllUserByRole("Instructor"));
        return "user/instructor-list";
    }


}
