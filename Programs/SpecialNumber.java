import java.util.*;
class Special
{
    int n;
    Special(int n)
    {
        this.n=n;
    }
    int factorial(int x)
    {
        if(x==1)
            return 1;
        else
            return x*factorial(x-1);
    }
    boolean isSpecial()
    {
        int tmp=n,sum=0;
        while(tmp>0)
        {
            sum+=factorial(tmp%10);
            tmp/=10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        Special ob=new Special(n);
        if(ob.isSpecial())
            System.out.println("It is a Special number");
        else
            System.out.println("It is not a Special number");
        sc.close();
    }
}
