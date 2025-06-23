/*
Write a Java program to create a class called Account with instance variables accountNumber and balance. 
Implement a parameterized constructor that initializes these variables with validation:
accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
*/
class Account{
    String accountNumber;int balance;
    Account(String accountNumber,int balance){
        if(accountNumber != null && !accountNumber.isEmpty() && balance>0){
            this.accountNumber=accountNumber;
            this.balance=balance;
        }
        else{
            System.out.println("Error, Either of your inputs are wrong");
        }
    }
}