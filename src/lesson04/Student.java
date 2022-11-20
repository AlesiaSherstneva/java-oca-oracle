package lesson04;

public class Student {
    int IDCardNumber;
    String name;
    String surname;
    byte yearOfStudy;
    float mathAvgScore;
    float econAvgScore;
    float langAvgScore;
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.IDCardNumber = 19233160;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.yearOfStudy = 3;
        student1.mathAvgScore = 7.9F;
        student1.econAvgScore = 8.3F;
        student1.langAvgScore = 6.8F;

        System.out.printf("Student %s %s has average score: %1.1f\n", student1.name, student1.surname,
                (student1.mathAvgScore + student1.econAvgScore + student1.langAvgScore) / 3);

        Student student2 = new Student();
        student2.IDCardNumber = 19233163;
        student2.name = "Anna";
        student2.surname = "Smirnova";
        student2.yearOfStudy = 1;
        student2.mathAvgScore = 8.1F;
        student2.econAvgScore = 8.6F;
        student2.langAvgScore = 8.3F;

        System.out.printf("Student %s %s has average score: %1.1f\n", student2.name, student2.surname,
                (student2.mathAvgScore + student2.econAvgScore + student2.langAvgScore) / 3);

        Student student3 = new Student();
        student3.IDCardNumber = 19233171;
        student3.name = "Petr";
        student3.surname = "Petrov";
        student3.yearOfStudy = 5;
        student3.mathAvgScore = 5.3F;
        student3.econAvgScore = 6.1F;
        student3.langAvgScore = 4.5F;

        System.out.printf("Student %s %s has average score: %1.1f\n", student3.name, student3.surname,
                (student3.mathAvgScore + student3.econAvgScore + student3.langAvgScore) / 3);
    }
}
