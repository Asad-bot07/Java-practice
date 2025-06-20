import java.util.*;
class Palindrome
{
    int num,revnum;
    Palindrome(int num)
    {
        this.num=num;
        revnum=0;
    }
    void reverse()
    {
        int tmp=num;
        while(tmp>0)
        {
            revnum=revnum*10+(tmp%10);
            tmp/=10;
        }
    }
    boolean check()
    {
        reverse();
        if(revnum==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        Palindrome ob=new Palindrome(num);
        if(ob.check())
            System.out.println("It is a Palindrome number");
        else
            System.out.println("It is not Palindrome number");
        sc.close();
    }
}
