package bg.unwe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();

        firstStudent = addStudentCourses(firstStudent);
        secondStudent = addStudentCourses(secondStudent);
        thirdStudent = addStudentCourses(thirdStudent);

        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);

        printStudentOutput(students);
    }

    public static Student addStudentCourses(Student student) {
        Course studentFirstCourse = new Course();
        Course studentSecondCourse = new Course();

        studentFirstCourse = addStudentGradesToCourse(studentFirstCourse);
        studentSecondCourse = addStudentGradesToCourse(studentSecondCourse);

        student.addCourse(studentFirstCourse);
        student.addCourse(studentSecondCourse);

        return student;
    }

    public static void printStudentOutput(ArrayList<Student> students) {
        for (int index = 1; index <= students.size(); index++) {
            StringBuilder studentOutput = new StringBuilder();
            studentOutput.append("Student " + index + ": ");

            Student currentStudent = students.get(index - 1);

            studentOutput.append("Name = " + currentStudent.getName() + ", ");

            int studentCoursesCount = currentStudent.getCoursesCount();
            studentOutput.append("Courses: ");

            for (int courseIndex = 1; courseIndex <= studentCoursesCount; courseIndex++) {
                Course currentCourse = currentStudent.getCourse(courseIndex - 1);

                studentOutput.append("[" + courseIndex + ": ");

                studentOutput.append("Name = " + currentCourse.getName() + ", ");
                studentOutput.append("Teacher = " + (currentCourse.getTeacher() == null ? "?" : currentCourse.getTeacher()) + ", ");
                studentOutput.append("Grades = ");

                for (int gradeIndex = 0; gradeIndex < currentCourse.getGradesCount(); gradeIndex++) {
                    Grade currentGrade = currentCourse.getGrade(gradeIndex);

                    // Last grade in the course
                    if (gradeIndex == currentCourse.getGradesCount() - 1) {
                        studentOutput.append((currentGrade.getValue() == null ? "?" : currentGrade.getValue()));
                    } else {
                        studentOutput.append((currentGrade.getValue() == null ? "?" : currentGrade.getValue()) + ", ");
                    }
                }

                //If the course is last one
                if (courseIndex == studentCoursesCount) {
                    studentOutput.append("]");
                } else {
                    studentOutput.append("],");
                }
            }

            System.out.println(studentOutput.toString());
        }
    }

    public static Course addStudentGradesToCourse(Course course) {
        Grade studentCourseFirstGrade = new Grade();
        Grade studentCourseSecondGrade = new Grade();

        course.addGrade(studentCourseFirstGrade);
        course.addGrade(studentCourseSecondGrade);

        return course;
    }
}