package com.example.demoApplication.Services.Interfaces;

import java.util.List;
import com.example.demoApplication.Models.Emp;
import com.example.demoApplication.Models.Employe;

public interface IHomeService {
    public Emp getEmp();
    public List<Employe> getEmps();
}
