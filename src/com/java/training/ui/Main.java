package com.java.training.ui;

import com.java.training.controller.EmployeeController;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        System.out.println("Enter Employee Details");
        System.out.println("Enter Employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter Employee age:");
        int age = scanner.nextInt();
        System.out.println("Enter Employee salary:");
        int salary = scanner.nextInt();
        System.out.println("Enter Employee Id:");
        int Id = scanner.nextInt();

        employeeController.createEmployee(name,Id,age,salary);
        employeeController.listEmployee();
        System.out.println("enter delete id");
        int deleteId = scanner.nextInt();
        employeeController.deleteEmployee(deleteId);
        employeeController.listEmployee();

        System.out.println("update employee details");
        int updateId = scanner.nextInt();
        employeeController.updateEmployee(updateId);
        employeeController.listEmployee();
    }
public static void printInstruction() {
    System.out.println("choice your choose");
    System.out.println("1.create employee details");
    System.out.println("2.list of employee details");
    System.out.println("3.update employee details");
    System.out.println("4.delete employee details");
}
}




