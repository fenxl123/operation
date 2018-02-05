package com.fx.multithread.produceconsumermodel.deadlock;

public class Testdeadlock {
	public static void main(String[] args) {
		Deadlock deadlock=new Deadlock();
		Thread thread=new Thread(deadlock);
		Thread thread2=new Thread(deadlock);
		thread.start();
		thread2.start();
		//System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId());
	}
}
