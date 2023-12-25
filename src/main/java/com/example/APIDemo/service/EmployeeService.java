package com.example.APIDemo.service;

import com.example.APIDemo.dto.CreateEmployeeRequest;
import com.example.APIDemo.dto.UpdateEmployeeRequest;
import com.example.APIDemo.repository.EmployeeRepository;
import com.example.APIDemo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
  public Employee create(CreateEmployeeRequest createEmployeeRequest){

        Employee employee = createEmployeeRequest.to();
        return employeeRepository.create(employee);
    }

    public Employee get(String id) {

        return employeeRepository.get(id);
    }
    public List<Employee> get(){
        return employeeRepository.get();
    }

    public Employee update(String id, UpdateEmployeeRequest request) {
      Employee employee = request.to();
      return employeeRepository.update(id,employee);
    }

    public Employee delete(String id) {
      return employeeRepository.delete(id);
    }
}
