package com.example.demoApplication.Controllers;

import com.example.demoApplication.Models.User;
import com.example.demoApplication.Services.spec.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Home")
public class HomeController {
    private final IUserService userService;
    @Autowired
    public HomeController(IUserService userService){
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Api";
    }

    @GetMapping("/getallemployes")
    public User getEmployes() {
        return userService.findByid(1);
    }
}
