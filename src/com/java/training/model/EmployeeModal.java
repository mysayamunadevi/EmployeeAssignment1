package com.java.training.model;

public class EmployeeModal {
    String name;
    int id;
    int age;
    int salary;

    public EmployeeModal(String name, int id, int age, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{"+"name='"+name+'\''+",age="+age+",salary="+salary+",id="+id+'}';
    }
}
