class Student {
    String name;
    int marks;
    char grade;

    Student() {
        name = "Unknown";
        marks = 0;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    Student(String name, int marks, char grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Yuvraj", 91);
        Student s3 = new Student("Rahul", 85, 'A');

        s1.display();
        s2.display();
        s3.display();
    }
}