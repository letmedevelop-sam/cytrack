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
   // LessonService

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
        model.addAttribute("instructors", userService.getInstructorsAndLessonsMap());
        return "user/instructor-list";
    }


    @GetMapping("/cybmentorList")
    public String cybmentorList(Model model){
        model.addAttribute("cybmentors", userService.getCybertekMentorsAndGroupsMap());
        return "user/cyb-mentor-list";
    }

    @GetMapping("/almnmentorList")
    public String almnmentorList (Model model){
        model.addAttribute("almnmentors", userService.getAlumniMentorsAndGroupsMap());
        return "user/almn-mentor-list";
    }




    @GetMapping("/studentList")
    public String studentList (Model model){
        model.addAttribute("students", userService.listAllUserByRole("Student"));
        return "user/student-list";
    }
/*
 @PostMapping("/create")
    public String insertUser(UserDTO user,Model model){  //this will activate SAVE button //We used UserDTO because after SAVE we want to see default placeholders//We need Model because we want to create new object
        userService.save(user);   //save will come from Service but we need to  implement it
        return "redirect:/user/create"; //we will again see the same page but with a new line added to our list and default place holders in all input boxes
        //instead of going to create.htlm how about if we call the createuser method?
    }

 */


}
