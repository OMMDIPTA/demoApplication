package com.example.demoApplication.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employe {
    @Column(name = "employee_id")
    private int employee_id;
    private String first_name;
    private String last_name;
}
