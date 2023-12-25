package com.example.APIDemo.controller;

import com.example.APIDemo.dto.CreateEmployeeRequest;
import com.example.APIDemo.dto.UpdateEmployeeRequest;
import com.example.APIDemo.models.Employee;
import com.example.APIDemo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmpolyeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody @Valid CreateEmployeeRequest request){
        return employeeService.create(request);
    }

    @GetMapping("/employee/{empId}")
    public Employee getEmployee(@PathVariable("empId") String id){
        return employeeService.get(id);
    }

    @GetMapping("/empoyee/all")
    public List<Employee> getEmployee(){
        return employeeService.get();
    }

    @PutMapping("/employee/{empId}")
    public Employee updateEmployee(@PathVariable("empId") String id, @RequestBody @Valid UpdateEmployeeRequest request){
        return employeeService.update(id,request);
    }

    @DeleteMapping("employee/{empId}")
    public Employee deleteEmployee(@RequestParam("empId") String id){
        return employeeService.delete(id);
    }
}
