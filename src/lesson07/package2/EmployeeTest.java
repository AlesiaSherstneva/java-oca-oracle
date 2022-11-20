package lesson07.package2;

import lesson07.package1.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee publicEmployee = new Employee(28); //ok
        // Employee defaultEmployee = new Employee("Ivanov"); //default constructor, compile error
        // Employee privateEmployee = new Employee(185.80); //private constructor, compile error

        // System.out.println(publicEmployee.salary); //private field, compile error
        System.out.println(publicEmployee.surname); //ok
        // System.out.println(publicEmployee.id); //default field, compile error

        publicEmployee.showSalary(); //ok
        publicEmployee.showSurname(); //ok
        publicEmployee.showId(); //ok
    }
}