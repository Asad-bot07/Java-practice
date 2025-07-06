/*
 * Write a Java program to create an abstract class Employee with abstract
 * methods calculateSalary() and displayInfo(). Create subclasses Manager and
 * Programmer that extend the Employee class and implement the respective
 * methods to calculate salary and display information for each role.
 * for employee
 * Adds a bonus of ₹10,000 and travel allowance of ₹5,000
 * for programmer
 * Adds a project allowance of ₹8,000 and coding incentive of ₹3,000.
 */
import java.util.Scanner;
abstract class Employeee{
    abstract void calculateSalary();
    abstract void displayInfo();
}
class Manager extends Employeee{
    String name;int id,salary;
    Manager(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void calculateSalary(){
        salary+=(10000+5000);
    }
    void displayInfo(){
        System.out.println("Employee id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Total Salary : "+salary);
    }
}
class programmer extends Employeee{
    String name;int id,salary;
    programmer(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void calculateSalary(){
        salary+=(8000+3000);
    }
    void displayInfo(){
        System.out.println("Programmer id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Total Salary : "+salary);
    }
}
class call{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Manager");
        System.out.println("Enter 2 for Programmer");
        int ch=sc.nextInt();
        sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter your name : ");
                    String name=sc.nextLine();
                    System.out.print("Enter your Employee id : ");
                    int id=sc.nextInt();
                    System.out.print("Enter your base Salary : ");
                    int salary=sc.nextInt();
                    Manager ob=new Manager(name, id, salary);
                    ob.calculateSalary();
                    ob.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter your name : ");
                    name=sc.nextLine();
                    System.out.print("Enter your Employee id : ");
                    id=sc.nextInt();
                    System.out.print("Enter your base Salary : ");
                    salary=sc.nextInt();
                    programmer ob1=new programmer(name, id, salary);
                    ob1.calculateSalary();
                    ob1.displayInfo();
                    break;
                default:
                    break;
            }
            sc.close();
    }
}