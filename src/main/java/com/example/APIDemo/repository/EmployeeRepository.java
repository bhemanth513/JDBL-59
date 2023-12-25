package com.example.APIDemo.repository;

import com.example.APIDemo.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {


    private HashMap<String, Employee> employeeMap = new HashMap<>();


    public Employee create(Employee employee){
        employeeMap.put(employee.getId(), employee);
        return employee;
    }


    public Employee get(String id) {
        return employeeMap.get(id);
    }

    public List<Employee> get(){
        return employeeMap.values().stream().collect(Collectors.toList());
    }

    public Employee update(String id, Employee employee) {
       Employee emp = employeeMap.get(id);
       if(emp!=null){
           //merge existing emp and new emp
           merge(emp,employee);
           employeeMap.put(id,employee);
       }
       return emp;
    }

    private Employee merge(Employee oldEmp, Employee newEmployee) {
        newEmployee.setCreatedOn(oldEmp.getCreatedOn());
        return newEmployee;
    }

    public Employee delete(String id) {
        return  employeeMap.remove(id);
    }
}
