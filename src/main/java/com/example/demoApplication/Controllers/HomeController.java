package com.example.demoApplication.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoApplication.Models.Emp;
import com.example.demoApplication.Models.Employe;
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
    @ResponseBody
    public Emp hello() {
        return homeService.getEmp();
    }

    @GetMapping("/getallemployes")
    @ResponseBody
    public List<Employe> getEmployes() {
        return homeService.getEmps();
    }
}
