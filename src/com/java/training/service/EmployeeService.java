package com.java.training.service;

import com.java.training.model.EmployeeModal;
import com.java.training.repository.EmployeeRepository;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    public static Scanner scanner=new Scanner(System.in);
    public void createEmployee(String name, int id, int age, int salary) {
        EmployeeModal employeeModal = new EmployeeModal(name, id, age, salary);
        employeeModal.setName(name);
        employeeModal.setId(id);
        employeeModal.setAge(age);
        employeeModal.setSalary(salary);
        employeeRepository.saveEmployee(employeeModal);
    }

    List<EmployeeModal> employeelist = employeeRepository.listEmployees();
    public void listEmployee(){
    for(EmployeeModal employeeModal:employeelist)
        System.out.println(employeeModal);
    }
    public void deleteEmployee(int deleteId) {
        for (EmployeeModal employeeModal : employeelist) {
                if (employeeModal.getId() == deleteId) employeelist.remove(employeeModal);
        }
    }
        public void updateEmployee(int updateId){
        for(EmployeeModal employee:employeelist)
            if(employee.getId()==updateId){
                System.out.println("enter update name");
                String name=scanner.next();
                System.out.println("enter update age");
                int age=scanner.nextInt();
                System.out.println("enter update salary");
                int salary=scanner.nextInt();
                employee.setName(name);
                employee.setAge(age);
                employee.setSalary(salary);


            }
    }
}
