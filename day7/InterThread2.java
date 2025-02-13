package com.celcom.day7;

import java.util.Scanner;

//Inter-Thread Communication-2

class SavingAccount{
	private long balanceAmount;
	void deposit(long amount) {
		this.balanceAmount=this.balanceAmount+amount;
	}
	
	void withdraw(long amount)
	{
		this.balanceAmount=this.balanceAmount-amount;
	}
	long getBalanceAmount()
	{
		return this.balanceAmount;
	}

	public void widthdraw(long amount) {
		// TODO Auto-generated method stub
		this.balanceAmount=balanceAmount-amount;
		
	}
}

class Widthdrawer extends Thread{
	SavingAccount savingAccount;
	
	Widthdrawer(SavingAccount savingAccount)
	{
		this.savingAccount=savingAccount;
	}
	
	@Override
	public void run() {
		synchronized(savingAccount)
		{
			System.out.println("Withdrawer is waiting for Depositer to deposit Money...");
			try {
				savingAccount.wait();
			}catch(InterruptedException e)
			{
				
			}
			System.out.println("Enter amount to widthdraw");
			long amount=new Scanner(System.in).nextLong();
			savingAccount.widthdraw(amount);
			System.out.println(amount +"widthdraw successfull");
			System.out.println("Balance :" +savingAccount.getBalanceAmount());
			
		}
	}
}

class Depositer extends Thread{
	SavingAccount savingAccount;
	
	Depositer(SavingAccount savingAccount)
	{
		this.savingAccount=savingAccount;
	}
	@Override
	public void run()
	{
		synchronized(savingAccount)
		{
			System.out.println("Depositer started to deposit the money....");
			System.out.println("Enter amount to deposit");
			long amount=new Scanner(System.in).nextLong();
			savingAccount.deposit(amount);
			System.out.println(amount+"deposited Scucessfully");
			System.out.println("Balance :" +savingAccount.getBalanceAmount());
			savingAccount.notify();
		}
	}
	
}

public class InterThread2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SavingAccount savingAccount=new SavingAccount();
		
		Widthdrawer widthdraw=new Widthdrawer(savingAccount);
		widthdraw.start();
		
		Thread.sleep(20000);
		
		Depositer deposit =new Depositer(savingAccount);
		deposit.start();
		

	}

}
