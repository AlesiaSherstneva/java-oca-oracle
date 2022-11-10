package lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ivanov", 25, 124.24, "Development");
        Employee employee2 = new Employee(2, "Petrov", 34, 98.95, "HR");

        System.out.println("Employee " + employee1.surname + ":");
        System.out.println("Old salary: " + employee1.salary);
        employee1.doubleSalary();
        System.out.println("New salary: " + employee1.salary);

        System.out.println("~~~~~~~~~~~~~~~~~~");

        System.out.println("Employee " + employee2.surname + ":");
        System.out.println("Old salary: " + employee2.salary);
        employee2.doubleSalary();
        System.out.println("New salary: " + employee2.salary);

        System.out.println("~~~~~~~~~~~~~~~~~~");
    }
}
