/*
Write a Java program to create a class called "Book" with instance variables title,
author, and price. Implement a default constructor and two parameterized constructors:
One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/
import java.util.*;
class Book{
    String author;int price;
    Book()
    {
        System.out.println("Hi, from constructor A (with no parameters)");
    }
    Book(String author,String title)
    {
        System.out.println("Author : "+author+"\nTitle : "+title);
    }
    Book(String title,String author,int price)
    {
        System.out.println("Author : "+author+"\nTitle : "+title+"\nPrice : "+price);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Author name : ");
        String author=sc.nextLine();
        System.out.println("Enter Title of the book : ");
        String title=sc.nextLine();
        System.out.println("Enter price : ");
        int price=sc.nextInt();
        Book ob=new Book();
        Book ob1=new Book(author,title);
        Book ob2=new Book(author,title,price);
        sc.close();
    }
}