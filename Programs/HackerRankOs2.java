/*
 * This code is for praticing and having a knowledge on "static block" of codes
 * What is static block?
 * A static block in Java is a block of code that runs once, when the class is loaded into memory, before any objects are created and before the main() method is called.
 */
import java.util.*;

public class HackerRankOs2{
    static int B,H;
    static boolean flag;
static
{
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    sc.close();
    if(B<=0 || H<=0)
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    else
    flag=true;
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class