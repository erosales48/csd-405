package Examples;
import java.util.ArrayList;


public class Main {
   
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("12345", "John", 90, 20));
        studentList.add(new Student("12346", "Jane", 80, 21));
        studentList.add(new Student("12347", "Mary", 70, 22));
        studentList.add(new Student("12348", "Tommy", 60, 23));
        studentList.add(new Student("12349", "Jack", 50, 24));
        studentList.add(new Student("12350", "Jerry", 40, 25));
        studentList.add(new Student("12351", "Lily", 30, 26));

        studentList.get(2).setName("Marian");

        for (Student student : studentList) {
            System.out.println(student.getStudentId() + "\t" + student.getName() + "\t" + student.getGrade() + "\t" + student.getAge());
        }
    }
}