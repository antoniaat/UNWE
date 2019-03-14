package bg.unwe;

public class Student {
    private String name;
    private String fNumber;
    private Grade[] grades;

    public Student(String name, String fNumber) {
        this.name = name;
        this.fNumber = fNumber;
        this.grades = new Grade[5];
    }

    public void addGrade(Grade grade, int index) {
        this.grades[index] = grade;
    }

    public int getGradesCount() {
        return this.grades.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }
}
