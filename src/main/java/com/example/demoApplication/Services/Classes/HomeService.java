package com.example.demoApplication.Services.Classes;

import org.springframework.stereotype.Service;

import com.example.demoApplication.Models.Emp;
import com.example.demoApplication.Services.Interfaces.*;

@Service
public class HomeService implements IHomeService {
    @Override
    public Emp getEmp(){
        return new Emp("Omm", 1);
    }
}
