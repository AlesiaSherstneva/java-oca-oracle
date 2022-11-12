package lesson7.package1;

@SuppressWarnings("unused")
public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee() {
    }

    Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    private Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
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