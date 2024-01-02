package com.tyss;

public class Thread2 extends Thread {
	
	  public synchronized void firstMethod(Thread1 t1) {
		  System.out.println("thread2 is running");
		   try {
			   System.out.println("thread 2 is going sleep stage");
			Thread.sleep(1000);
			System.out.println("now  thread2 is trying to call thread1 last method");
			t1.lastMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   public synchronized void lastMethod() {
		   System.out.println("last method of thread 2");
		   
	   }

}
