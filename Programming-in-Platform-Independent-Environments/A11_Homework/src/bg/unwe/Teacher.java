package bg.unwe;

public class Teacher {
    private String name;

    public String getName() {
        return name == null ? "?" : name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
