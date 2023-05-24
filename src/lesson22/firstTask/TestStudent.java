package lesson22.firstTask;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Alesia"));
        student.setCourse(3);
        student.setGrade(9);

        student.showInfo();
    }
}