/*
Design a Java program using inheritance to model the following:
You are developing a system for an Organization.
Create a base class Employee with:
Data members: name, empId, salary
Method: displayDetails() – displays employee details
Create a subclass Manager that:
Inherits from Employee
Has additional data member: department
Overrides displayDetails() to include department information
In the main() method:
Create an object of Manager, set values, and call displayDetails()
   */
import java.util.*;
public class Employee
{
    String name;int empId,salary;
    Employee(String name,int empId,int salary)
    {
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }
    void displayDetails()
    {
        System.out.println("Name : "+name+"\nEmployee ID : "+empId+"\nSalary : "+salary);
    }
}
class Manager extends Employee
{
    String departInfo;
    Manager(String departInfo,String name,int empId,int salary)
    {
        super(name, empId, salary);
        this.departInfo=departInfo;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department : "+departInfo);
    }
    public static void main(String[] args)
    {
        String nm,dp;int id,sal;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name :");
        nm=sc.nextLine();
        System.out.print("Enter your Department :");
        dp=sc.nextLine();
        System.out.print("Enter your Employee id :");
        id=sc.nextInt();
        System.out.print("Enter your Salary :");
        sal=sc.nextInt();
        Manager ob=new Manager(dp,nm,id,sal);
        ob.displayDetails();
        sc.close();
    }
}