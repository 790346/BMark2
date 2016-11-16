import java.util.Scanner;
import java.util.ArrayList;

public class Student
{
    int stuID;
    double stuGPA;
    String stuName;
    
    public double input2;
    public String input1;
    public int input0;
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    public Student(int id, int gpa, String name)
    {
        stuID = id;
        stuGPA = gpa;
        stuName = name;
    }
    
    public int getID()
    {
        return stuID;
    }
    public int getGPA()
    {
        return stuGPA;
    }
    public String getName()
    {
        return stuName;
    }
    
    public void setID(int id)
    {
        stuID = id;
    }
    public void setGPA(int gpa)
    {
        stuGPA = gpa;
    }
    public void setName(String name)
    {
        stuName = name;
    }
    
    public void deleteStudent()
    {
        System.out.println("Which student would you like to delete? ");
        input1 = null;
        input0 = 0;
        input2 = 0;
    }
    
}