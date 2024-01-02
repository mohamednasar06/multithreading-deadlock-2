package com.tyss;

public class Thread1 extends Thread {
	
   public synchronized void firstMethod(Thread2 t2) {
	   System.out.println("thread1 is running");
	   try {
		   System.out.println("thread 1 is going sleep stage");
		Thread.sleep(1000);
		System.out.println("now  thread1 is trying to call thread2 last method");
		t2.lastMethod();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public synchronized void lastMethod() {
	   System.out.println("last method of thread1");
	   
   }
	

}
