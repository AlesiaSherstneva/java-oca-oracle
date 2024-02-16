package lesson29;

import java.util.List;

public class Homework {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "IT", 600);
        Employee employee2 = new Employee("Richard Smith", "IT", 380);
        Employee employee3 = new Employee("Robert Walker", "IT", 190);
        Employee employee4 = new Employee("Edith Bryant", "HR", 450);
        Employee employee5 = new Employee("Elizabeth Jackson", "HR", 320);
        Employee employee6 = new Employee("Evelyn Bell", "IT", 480);
        Employee employee7 = new Employee("Analytics", "Analytics", 275);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5, employee6, employee7);

        TestEmployee testEmployee = new TestEmployee();

        System.out.println("-".repeat(63));
        System.out.println("Employees from IT department whose salary is more than 200:\n");
        testEmployee.employeesFiltering(employees, e -> e.department.equals("IT") && e.salary > 200);

        System.out.println("-".repeat(63));
        System.out.println("Employees whose name starts with \"E\" and salary not equals 450:\n");
        testEmployee.employeesFiltering(employees, e -> e.name.startsWith("E") && e.salary != 450);

        System.out.println("-".repeat(63));
        System.out.println("Employees whose name is the same as department name:\n");
        testEmployee.employeesFiltering(employees, e -> e.name.equals(e.department));
        System.out.println("-".repeat(63));
    }
}