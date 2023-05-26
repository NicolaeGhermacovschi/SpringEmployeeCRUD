package com.project.L41.controller.employeeController;

import com.project.L41.model.employeeModel.Employee;
import com.project.L41.service.employeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeControler {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/employee/add")
    public void createEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping("/employee/all")
    List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }
}