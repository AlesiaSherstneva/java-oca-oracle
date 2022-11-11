package lesson6;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    float mathAvgScore;
    float econAvgScore;
    float langAvgScore;

    public Student() {
    }

    public Student(int id, String name, String surname, int course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Student(int id, String name, String surname, int course,
                   float mathAvgScore, float econAvgScore, float langAvgScore) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.mathAvgScore = mathAvgScore;
        this.econAvgScore = econAvgScore;
        this.langAvgScore = langAvgScore;
    }
}

@SuppressWarnings("DuplicatedCode")
class StudentTest {
    public static void main(String[] args) {
        StudentTest test = new StudentTest();

        Student student1 = new Student();
        student1.id = 19233160;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.course = 3;
        student1.mathAvgScore = 7.9F;
        student1.econAvgScore = 8.3F;
        student1.langAvgScore = 6.8F;

        test.countAverageScore(student1);

        Student student2 = new Student(19233163, "Anna", "Smirnova", 1);
        student2.mathAvgScore = 8.1F;
        student2.econAvgScore = 8.6F;
        student2.langAvgScore = 8.3F;

        test.countAverageScore(student2);

        Student student3 = new Student(19233171, "Petr", "Petrov", 5,
                5.3F, 6.1F, 4.5F);

        test.countAverageScore(student3);
    }

    void countAverageScore(Student student) {
        System.out.printf("Student %s %s has average score: %1.1f\n", student.name, student.surname,
                (student.mathAvgScore + student.econAvgScore + student.langAvgScore) / 3);
    }
}
