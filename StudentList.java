import java.util.ArrayList;
import java.util.Scanner;

public class StudentList
{
    Student students = new Student(1, 4, "Jeffry");
    ArrayList<Student> studs = new ArrayList<Student>();
    public void addStudent()
    {
        students.getStudent();
        ArrayList<Student> studs = new ArrayList<Student>(2);
    }
    public void printStudent()
    {
        System.out.println(students);
    }
}