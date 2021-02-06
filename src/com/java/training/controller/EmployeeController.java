package com.java.training.controller;
import com.java.training.service.EmployeeService;
import com.java.training.repository.EmployeeRepository;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();
    EmployeeRepository employeeRepository = new EmployeeRepository();

    public void createEmployee(String name, int id, int salary, int age) {
        employeeService.createEmployee(name, age, salary, id);
    }
    public void listEmployee(){
        employeeService.listEmployee();
    }
    public void deleteEmployee(int deleteId){
        employeeService.deleteEmployee(deleteId);
    }
    public void updateEmployee(int updateId){
        employeeService.updateEmployee(updateId);
    }
}
