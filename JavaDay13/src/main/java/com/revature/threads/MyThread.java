package com.revature.threads;

public class MyThread extends Thread {
	
	// doesn't automatically ask us to override run()
	
	int changeVal;
	
	public MyThread() {
		this.changeVal = 3;
	}
	
	public MyThread(int changeVal) {
		this.changeVal = changeVal;
	}
	
	@Override
	public void run() {
		System.out.println("Running: " + Thread.currentThread());
		Resource.change(changeVal, 3000);
	}
	
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		t1.setName("Thread A");
		//t1.setPriority(10);
		
		Thread t2 = new MyThread(5);
		t2.setName("Thread B");
		//t2.setPriority(1);
		
		t1.start();
		t2.start();
		
	}

}
