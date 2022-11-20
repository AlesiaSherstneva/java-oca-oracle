package lesson07.package1;

@SuppressWarnings("unused")
public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int age) {
        this.age = age;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public void showSalary() {
        System.out.println(salary);
    }
}