import java.util.*;
class Disarium
{
    int num,c;
    Disarium(int num)
    {
        this.num=num;
        c=0;
    }
    void countDigit()
    {
        int tmp=num;
        while(tmp>0)
        {
            tmp/=10;
            c++;
        }
    }
    int cal(int n)
    {
        int sum=0,tmp=num;
        while(tmp>0)
        {
            sum+=Math.pow(tmp%10,n);
            tmp/=10;
            n--;
        }
        return sum;
    }
    boolean check()
    {
        countDigit();
        if(cal(num)==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        Disarium ob=new Disarium(num);
        if(ob.check())
            System.out.println("It is a disarium number");
        else
            System.out.println("It is not disarium number");
        sc.close();
    }
}
