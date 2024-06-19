package Examples;
public class Student {
    private String studentId;
    private String name;
    private double grade;
    private int age;
    // Constructor
    public Student(String studentId, String name, double grade, int age) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
    // Getters and Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
    public int getAge() {
        return age;
    }
}
