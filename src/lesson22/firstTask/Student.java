package lesson22.firstTask;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (course >= 1 && course <= 10) this.grade = grade;
    }

    public void showInfo() {
        System.out.printf("Student %s, %d course, grade = %d\n", getName(), getCourse(), getGrade());
    }
}