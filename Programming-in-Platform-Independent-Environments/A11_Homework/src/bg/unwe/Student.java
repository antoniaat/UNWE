package bg.unwe;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student() {
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name == null ? "?" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public Course getCourse(int index) {
        return this.courses.get(index);
    }

    public int getCoursesCount() {
        return this.courses.size();
    }

//    @Override
//    public String toString() {
//        StringBuilder student = new StringBuilder();
//
//        student.append("Student ");
//        student.append("Student ");
//
//
//        return super.toString();
//    }
}
