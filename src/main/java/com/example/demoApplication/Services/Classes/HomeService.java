package com.example.demoApplication.Services.Classes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoApplication.Models.*;
import com.example.demoApplication.Repository.EmployeRepository;
import com.example.demoApplication.Services.Interfaces.*;

@Service
public class HomeService implements IHomeService {

    private final EmployeRepository employeRepository;

    @Autowired
    public HomeService(EmployeRepository employeRepository){
        this.employeRepository = employeRepository;
    }

    @Override
    public Emp getEmp(){
        return new Emp("Omm", 1);
    }

    @Override
    public List<Employe> getEmps(){
        return employeRepository.findAll();
    }
}
