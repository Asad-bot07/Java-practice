/*
* Question
Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides 
the getArea() method to calculate the area of a rectangle.
 */
import java.util.*;
class Shape{
    void getArea(){}
}
class Rectangle extends Shape{
    int length,breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void getArea()
    {
        System.out.println("Area of the Rectangle : "+length*breadth);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length : ");
        int length=sc.nextInt();
        System.out.print("Enter breadth : ");
        int breadth=sc.nextInt();
        Rectangle ob=new Rectangle(length,breadth);
        ob.getArea();
        sc.close();
    }
}