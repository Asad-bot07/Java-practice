/*
Write a Java program to create a class known as "BankAccount" with methods 
called deposit() and withdraw().Create a subclass called SavingsAccount that overrides the 
withdraw() method to prevent withdrawals if the account balance falls below one hundred.
*/
import java.util.*;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
class BankAccount{
    void deposit(){}
    void withdraw(){}
}
class SavingsAccount extends BankAccount{
    static int money=0;
    static boolean bankBalance()
    {
        if(money<100)
        return false;
        else
        return true;
    }
    void withdraw(int withdrawal)
    {
        if(bankBalance())
        {
            money=money-withdrawal;
            System.out.println("Money withdrawn Successfully");
        }
        else{
            System.out.println("Not enough balance :(");
        }
    }
    void deposit(int depositAmt)
    {
        if(depositAmt<100)
        System.out.println("To low amount\nTransaction cannot be performed");
        else
        {
            money+=depositAmt;
            System.out.println("Amount deposited successfully");
        }
    }
    void checkBalance()
    {
        System.out.println("=======================================================");
        System.out.println("------------------  Account Balance -------------------");
        System.out.println("=======================================================");
        System.out.println("--------- Available Balance : "+money+" -----------------");
        System.out.println("=======================================================");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;long banckAccNo;int money;
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.print("Enter your bank account number(dw i'll not steal your money,hehe)");
        banckAccNo=sc.nextLong();
        while(true)
        {
            System.out.println("Enter 1 to withdraw money");
            System.out.println("Enter 2 to deposit money");
            System.out.println("Enter 3 to check balance");
            System.out.println("Enter 4 to exit menu");
            int ch=sc.nextInt();
            SavingsAccount ob=new SavingsAccount();
            switch (ch) {
                case 1:
                System.out.println("Enter the amount ");
                money=sc.nextInt();
                // SavingsAccount ob=new SavingsAccount();
                ob.withdraw(money);
                break;
                case 2:
                    System.out.println("Enter the amount ");
                    money=sc.nextInt();
                    ob.deposit(money);
                    break;
                case 3:
                    ob.checkBalance();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Choose correct option");
            }
        }
    }
}
/*
 * Enter your name : Asad Hussain
Enter your bank account number(dw i'll not steal your money,hehe)2121222
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
1
Enter the amount 
100000
Not enough balance :(
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
3
=======================================================
------------------  Account Balance -------------------
=======================================================
--------- Available Balance : 0 -----------------
=======================================================
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
2
Enter the amount 
150000
Amount deposited successfully
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
3
=======================================================
------------------  Account Balance -------------------
=======================================================
--------- Available Balance : 150000 -----------------
=======================================================
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
1
Enter the amount 
10000
Money withdrawn Successfully
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
3
=======================================================
------------------  Account Balance -------------------
=======================================================
--------- Available Balance : 140000 -----------------
=======================================================
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
1
Enter the amount 
25000
Money withdrawn Successfully
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
3
=======================================================
------------------  Account Balance -------------------
=======================================================
--------- Available Balance : 115000 -----------------
=======================================================
Enter 1 to withdraw money
Enter 2 to deposit money
Enter 3 to check balance
Enter 4 to exit menu
4
 */