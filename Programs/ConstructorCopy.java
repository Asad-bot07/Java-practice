/*
Write a Java program to create a class called Rectangle with instance variables length and width. 
Implement a parameterized constructor and a copy constructor that initializes a new object 
using the values of an existing object. Print the values of the variables.
*/
import java.util.*;
class rectangle{
    int length,width;
    rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    rectangle(rectangle obj)
    {
        this.length=obj.length+10;
        this.width=obj.width+10;
    }
    void display()
    {
        System.out.println("Length : "+length+"\nWidth : "+width);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of length : ");
        int length=sc.nextInt();
        System.out.print("Enter the value of width : ");
        int width=sc.nextInt();
        rectangle ob=new rectangle(length, width);
        rectangle ob1=new rectangle(ob);
        System.out.println("Default Constructor : ");
        ob.display();
        System.out.println("Copied Constructor : ");
        ob1.display();
        sc.close();
    }
}