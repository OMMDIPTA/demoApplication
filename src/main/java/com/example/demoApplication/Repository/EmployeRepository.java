package com.example.demoApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoApplication.Models.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    
}
