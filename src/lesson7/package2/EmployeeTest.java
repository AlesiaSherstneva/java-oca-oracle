package lesson7.package2;

import lesson7.package1.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee publicEmployee = new Employee(); //ok
        // Employee defaultEmployee = new Employee("Ivanov", 25); //default constructor, compile error
        // Employee privateEmployee = new Employee(3, "Petrov", 34, 185.80, "Development"); //private constructor, compile error

        // System.out.println(publicEmployee.salary); //private field, compile error
        System.out.println(publicEmployee.surname); //ok
        // System.out.println(publicEmployee.id); //default field, compile error

        publicEmployee.showSalary(); //ok
        publicEmployee.showSurname(); //ok
        publicEmployee.showId(); //ok
    }
}