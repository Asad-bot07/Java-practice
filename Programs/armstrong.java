import java.util.*;
class Armstrong
{
    int n;
    Armstrong(int n)
    {
        this.n=n;
    }
    double power(int n,int l)
    {
        return Math.pow(n,l);
    }
    int check()
    {
        int temp=n,c=0;
        while(temp>0)
        {
            temp=temp/10;
            c++;
        }
        int tmp=n,sum=0;
        while(tmp>0)
        {
            sum+=power(tmp%10,c);
            tmp=tmp/10;
        }
        if(sum==n)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n=sc.nextInt();
        Armstrong ob=new Armstrong(n);
        if(ob.check()==1)
            System.out.println("It is a Armstrong number");
        else
            System.out.println("It is not a Armstrong number");
        sc.close();
    }
}
