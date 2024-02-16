package lesson29;

import java.util.List;
import java.util.function.Predicate;

public class TestEmployee {
    void printEmployee(Employee employee) {
        System.out.printf("Employee %s, %s department, salary %d$.\n",
                employee.name, employee.department, employee.salary);
    }

    void employeesFiltering(List<Employee> employees, Predicate<Employee> condition) {
        for (Employee employee: employees) {
            if (condition.test(employee)) {
                printEmployee(employee);
            }
        }
    }
}