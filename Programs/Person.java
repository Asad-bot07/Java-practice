// Person.java
/*
Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() 
method to include the employee's job title.
*/
import java.util.*;
class Person{
    void getFirstName(){}
    void getLastName(){}
}
class employeee extends Person{
    int id;String firstName,design;
    Scanner sc=new Scanner(System.in);
    void getFirstName(){
        System.out.println("Enter first name : ");
        firstName=sc.nextLine();
    }
    void getLastName()
    {
        System.out.println("Enter your job role : ");
        design=sc.nextLine();
    }
    void getEmployeeId()
    {
        System.out.print("Enter Employee id : ");
        id=sc.nextInt();
    }
    void display()
    {
        getFirstName();;
        getLastName();
        getEmployeeId();
        System.out.println("Name : "+firstName+"\nJob Role : "+design+"\nEmployee id : "+id);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        employeee ob=new employeee();
        ob.display();
        sc.close();
    }
}

