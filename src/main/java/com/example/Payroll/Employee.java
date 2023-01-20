package com.example.Payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private  String name
}
