package HW_8;

public class StudentGrade {
    String name;
    Integer[] grades;

    public void enterGrade(int sessionNumber, int grade) {
        grades[sessionNumber - 1] = grade;
    }

    public Integer getGrade(int sessionNumer) {
        return grades[sessionNumer - 1];
    }
}
