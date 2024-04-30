package com.example.demoApplication.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoApplication.Models.Emp;
import com.example.demoApplication.Services.Interfaces.*;;

@RestController
@RequestMapping("/Home")
public class HomeController {
    
    private final IHomeService homeService;

    @Autowired
    public HomeController(IHomeService homeService){
        this.homeService = homeService;
    }

    @GetMapping("/hello")
    public @ResponseBody Emp hello() {
        return homeService.getEmp();
    }
}
