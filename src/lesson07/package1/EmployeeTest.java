package lesson07.package1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee publicEmployee = new Employee(33); //ok
        Employee defaultEmployee = new Employee("Ivanov"); //ok
        // Employee privateEmployee = new Employee(185.80); //private constructor, compile error

        // System.out.println(publicEmployee.salary); //private field, compile error
        System.out.println(publicEmployee.surname); //ok
        System.out.println(publicEmployee.id); //ok

        // System.out.println(defaultEmployee.salary); //private field, compile error
        System.out.println(defaultEmployee.surname); //ok
        System.out.println(defaultEmployee.id); //ok

        publicEmployee.showSalary(); //ok
        publicEmployee.showSurname(); //ok
        publicEmployee.showId(); //ok

        defaultEmployee.showSalary(); //ok
        defaultEmployee.showSurname(); //ok
        defaultEmployee.showId(); //ok
    }
}
