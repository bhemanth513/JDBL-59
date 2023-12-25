package com.example.APIDemo.models;

import com.example.APIDemo.models.Address;
import com.example.APIDemo.models.Department;
import lombok.*;

@Setter
@Getter
@Builder
public class Employee {
    private String id; // which is given to the employee
    private String name;
    private int age;
    private Department department;
    private Address address;
    private Long createdOn;
    private Long updatedOn;


}
