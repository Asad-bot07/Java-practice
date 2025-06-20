import java.util.*;
class dectoany
{
    int dec,bin,oct;
    String hex;
    dectoany(int n)
    {
        dec=n;
        bin=oct=0;
        hex="";
    }
    int convert_bin(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
        {
            return convert_bin(n/2)*10+n%2;
        }
    }
    int convert_oct(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
        {
            return n%8+10*convert_oct(n/8);
        }
    }
    String convert_hex(int n)
    {
        if(n==0)
            return hex;
        else
        {
            int r=n%16;
            if(r<10)
                hex=r+hex;
            else
                hex=(char)(55+r)+hex;
            return convert_hex(n/16);
        }
    }
    public static void main(String[] args)
    {
        int ch,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        dectoany ob=new dectoany(n);
        while(true)
        {
            System.out.println("Enter 1 to convert to Binary\nEnter 2 to convert to Octal\nEnter 3 to convert to Hexadecimal\nEnter 4 to exit the menu");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Binary equivalent is "+ob.convert_bin(n));
                       break;
                case 2:System.out.println("Octal equivalent is "+ob.convert_oct(n));
                       break;
                case 3:System.out.println("Hexadecimal equivalent is "+ob.convert_hex(n));
                       break;
                case 4:System.exit(0);
                default:System.out.println("INVALID INPUT!!");
            }
            sc.close();
        }
    }
}
