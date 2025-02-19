package com.celcom.assignments1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Not Deposited");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("New balance: " + balance);
        }else {
            System.out.println("Insufficient balance");
        }
    }

   
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}


class Bank{
	private List<Account> acc;

    
    public Bank() {
    	acc = new ArrayList<>();
    }

    
    public void addAccount(Account account) {
        acc.add(account);
        System.out.println("Account with account number " + account.getAccountNumber() + " added.");
    }

    
}

public class BankAcc {
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        
        Scanner sc=new Scanner(System.in);
        

        Account obj;
        
        
        while(true) {
        	
        	System.out.println("Enter Choice: 1.Add account 2.deposit 3. Withdraw 4.Exit");
            int choice = sc.nextInt();
            
        	
        	 switch(choice)
             {
             case 1:
            	 
             	System.out.println("Enter Account Number , User name, Amount");
             	obj= new Account(sc.next(),sc.next(),sc.nextDouble());
             	
             	bank.addAccount(obj);
             	 break;
             case 2:
            	 
             	System.out.println("Enter Account Number , User name, Balance");
             	obj= new Account(sc.next(),sc.next(),sc.nextDouble());
             	
             	System.out.println("Enter Deposit Amount");
             	double depositAmt=sc.nextInt();
             	
             	obj.deposit(depositAmt);
             	break;
             	
             case 3:
            	 
             	System.out.println("Enter Account Number , User name, Balance");
             	obj= new Account(sc.next(),sc.next(),sc.nextDouble());
             	
             	System.out.println("Enter Withdraw Amount");
             	double withdrawAmt=sc.nextInt();
             	
             	obj.withdraw(withdrawAmt);
             	break;
             	
             case 4:
            	 
             	System.out.println("Exiting");
             	break;
             	
             default:
            	 System.out.println("Invalid choice");
             	
             	
             }
        	 if(choice==4)
        	 {
        		 break;
        	 }
        	 
            
        	
        }
        
       
       

        
    }
}
