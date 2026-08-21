import java.util.*;

class Employee{
    String name;
    int employeeId;
    double basicSalary;

    Employee(String empName, int id, double salary){
        name = empName;
        employeeId = id;
        basicSalary = salary;
    }

    public double calculateSalary(){
        return basicSalary;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("EmployeeId: " + employeeId);
        System.out.println("BasicSalary: " + basicSalary);
    }
}

class Manager extends Employee{
    double allowance;

    Manager(String empName, int id, double salary){
        super(empName, id, salary);
        allowance = 20;
    }

    public double calculateSalary(){
        return basicSalary * (1 + allowance / 100);
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("EmployeeId: " + employeeId);
        System.out.println("BasicSalary: " + basicSalary);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Developer extends Employee{
    double allowance;

    Developer(String empName, int id, double salary){
        super(empName, id, salary);
        allowance = 15;
    }

    public double calculateSalary(){
        return basicSalary * (1 + allowance / 100);
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("EmployeeId: " + employeeId);
        System.out.println("BasicSalary: " + basicSalary);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class EmployeeSalary{
    public static void main(String args[]){
        Manager Lak = new Manager("Lakshit", 1, 100);
        Developer Dev = new Developer("Manavjit", 2, 1000);

        Lak.displayDetails();
        Dev.displayDetails();
    }
}