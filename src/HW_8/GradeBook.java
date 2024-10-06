package HW_8;

public class GradeBook {
    StudentGrade[] studentGrades; //строчки журнала

    public void enterGrade(String studentName, int sessionNumber, int grade) {
        StudentGrade studentGrade = findStudentByName(studentName);
        if(studentGrade == null) {
            System.out.println("Cant find" + studentName);
            return;
        }
        studentGrade.enterGrade(sessionNumber, grade);

    }

    StudentGrade findStudentByName(String studentName) {
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.name.equals(studentName)) {
                return studentGrade;
            }
        }
        return null;
    }

    public void printGradesForSession(int sessionNumber) {
        for (StudentGrade studentGrade : studentGrades) {
            Integer grade = studentGrade.getGrade(sessionNumber);
            if(grade != null) {
                System.out.println(studentGrade.name + ":" + grade);
            }
        }
    }

    public void printAllGrades() {
        for (StudentGrade studentGrade : studentGrades) {
            System.out.print(studentGrade.name + ":");
            for(Integer grade: studentGrade.grades) {
                if(grade == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(" " + grade);
                }
            }
            System.out.println();
        }
     }

     public double avgGrade(String studentName) {
        StudentGrade studentGrade = findStudentByName(studentName);
        if(studentGrade == null) {
            System.out.println("can't find");
            return -1;
            }
        int numberOfGrades = 0;
        double gradeSum = 0;
        for (Integer grade: studentGrade.grades){
            if(grade != null) {
                numberOfGrades++;
                gradeSum += grade;

            }
        }
        return gradeSum / numberOfGrades;
     }
}
