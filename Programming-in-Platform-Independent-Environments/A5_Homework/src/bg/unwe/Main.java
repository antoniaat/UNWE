package bg.unwe;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Toni", "15113928392");
        Course firstCourse = new Course("First Course");
        Course secondCourse = new Course("Second Course");
        Course thirdCourse = new Course("Third Course");
        Course fourthCourse = new Course("Fourth Course");
        Course fifthCourse = new Course("Fifth Course");

        Grade firstGrade = new Grade(firstCourse, 6);
        Grade secondGrade = new Grade(secondCourse, 5);
        Grade thirdGrade = new Grade(thirdCourse, 4);
        Grade fourthGrade = new Grade(fourthCourse, 3);
        Grade fifthGrade = new Grade(fifthCourse, 2);

        student.addGrade(firstGrade, 0);
        student.addGrade(secondGrade, 1);
        student.addGrade(thirdGrade, 2);
        student.addGrade(fourthGrade, 3);
        student.addGrade(fifthGrade, 4);

        System.out.println("Student: Name = " + student.getName() + ", FN = " + student.getfNumber());

        System.out.println("Grade " + 1 + ": Course = " + firstCourse.getName() + ", Value = " + firstGrade.getValue());
        System.out.println("Grade " + 2 + ": Course = " + secondCourse.getName() + ", Value = " + secondGrade.getValue());
        System.out.println("Grade " + 3 + ": Course = " + thirdCourse.getName() + ", Value = " + thirdGrade.getValue());
        System.out.println("Grade " + 4 + ": Course = " + fourthCourse.getName() + ", Value = " + fourthGrade.getValue());
        System.out.println("Grade " + 5 + ": Course = " + fifthCourse.getName() + ", Value = " + fifthGrade.getValue());
    }
}
