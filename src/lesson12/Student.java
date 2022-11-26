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

    @Override
    public String toString() {
        return name + ", " + course + " course, grade=" + grade;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 4, 6.52);
        Student student2 = new Student("Ivan", 3, 7.41);
        Student student3 = new Student("Ivan", 4, 5.94);
        Student student4 = new Student("Petr", 4, 6.52);
        Student student5 = new Student("Ivan", 4, 6.52);

        System.out.println(student1 + " and " + student2);
        equalsWithIf(student1, student2);
        equalsWithNestedIf(student1, student2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(student1 + " and " + student3);
        equalsWithIf(student1, student3);
        equalsWithNestedIf(student1, student3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(student1 + " and " + student4);
        equalsWithIf(student1, student4);
        equalsWithNestedIf(student1, student4);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(student1 + " and " + student5);
        equalsWithIf(student1, student5);
        equalsWithNestedIf(student1, student5);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
