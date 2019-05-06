package bg.unwe;

import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Grade> grades;

    public Course() {
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name == null ? "?" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public Grade getGrade(int index) {
        return this.grades.get(index);
    }

    public int getGradesCount () {
        return this.grades.size();
    }


}
