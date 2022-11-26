package lesson12;

public class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest {
    public static void main(String[] args) {
    }

    public static void equalsWithIf(Student student1, Student student2) {
        if (student1.name.equals(student2.name)
                && student1.course == student2.course
                && student1.grade == student2.grade) {
            System.out.println("Students are equals");
        } else {
            System.out.println("Students are not equals");
        }
    }

    public static void equalsWithNestedIf(Student student1, Student student2) {
        if (student1.name.equals(student2.name)) {
            if (student1.course == student2.course) {
                if (student1.grade == student2.grade) {
                    System.out.println("Students are equals");
                } else {
                    System.out.println("Students have different grades");
                }
            } else {
                System.out.println("Students have different courses");
            }
        } else {
            System.out.println("Students have different names");
        }
    }
}
