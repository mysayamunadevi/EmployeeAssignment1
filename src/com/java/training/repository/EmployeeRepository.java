package com.java.training.repository;

import com.java.training.model.EmployeeModal;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    List<EmployeeModal> employeeModalList=new ArrayList<>();
    public void saveEmployee(EmployeeModal employeeModal){
        employeeModalList.add(employeeModal);
    }

    public List<EmployeeModal> listEmployees() {
        return employeeModalList;
    }
}
