package com.tyss;

public class MainThread extends Thread {
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	public void m1() {
		this.start();
		t1.firstMethod(t2);
		
		
	}
	public void run() {
		t2.firstMethod(t1);
		
	}

	public static void main(String[] args) {
		System.out.println("hello");
		
		MainThread m1=new MainThread();
		m1.m1();
		
		
	}
}
