public class Student {

    public Student() {}
    public Student(String name, char grade) { this.name = name; this.grade = grade; }

    public void setName(String name) { this.name = name; }
    public void setGrade(char grade) { this.grade = grade; }
    public String getName() { return name; }
    public char getGrade() { return grade; }

    private String name;
    private char grade;

}
