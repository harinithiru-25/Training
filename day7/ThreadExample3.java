package com.celcom.day7;

class MyThread1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("My Thread Running.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

}

public class ThreadExample3 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyThread1());
		System.out.println(t1.getState()); //NEW
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.start();

		Thread.sleep(3000);
		System.out.println("Main End");
		
		t1.suspend();
		
		System.out.println(t1.getState());

	}

}
