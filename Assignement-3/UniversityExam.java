import java.util.*;

class Student{
    String name;
    int rollNumber;
    double marks;

    Student(String studentName, int roll, double studentMarks){
        name = studentName;
        rollNumber = roll;
        marks = studentMarks;
    }

    public String calculateGrade(){
        return "F";
    }

    public void displayResult(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

class EngineeringStudent extends Student{

    EngineeringStudent(String studentName, int roll, double studentMarks){
        super(studentName, roll, studentMarks);
    }

    public String calculateGrade(){
        if(marks >= 90)
            return "A";
        else if(marks >= 75)
            return "B";
        else if(marks >= 60)
            return "C";
        else if(marks >= 40)
            return "D";
        else
            return "F";
    }

    public void displayResult(){
        super.displayResult();
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Course: Engineering");
    }
}

class MedicalStudent extends Student{

    MedicalStudent(String studentName, int roll, double studentMarks){
        super(studentName, roll, studentMarks);
    }

    public String calculateGrade(){
        if(marks >= 85)
            return "A";
        else if(marks >= 70)
            return "B";
        else if(marks >= 55)
            return "C";
        else if(marks >= 40)
            return "D";
        else
            return "F";
    }

    public void displayResult(){
        super.displayResult();
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Course: Medical");
    }
}

class ManagementStudent extends Student{

    ManagementStudent(String studentName, int roll, double studentMarks){
        super(studentName, roll, studentMarks);
    }

    public String calculateGrade(){
        if(marks >= 80)
            return "A";
        else if(marks >= 65)
            return "B";
        else if(marks >= 50)
            return "C";
        else if(marks >= 40)
            return "D";
        else
            return "F";
    }

    public void displayResult(){
        super.displayResult();
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Course: Management");
    }
}

public class UniversityExam{
    public static void main(String args[]){

        Student[] students = {
            new EngineeringStudent("Lakshit", 101, 85),
            new MedicalStudent("Manavjit", 102, 72),
            new ManagementStudent("Yuvraj", 103, 88)
        };

        for(Student s : students){
            s.displayResult();
            System.out.println();
        }
    }
}