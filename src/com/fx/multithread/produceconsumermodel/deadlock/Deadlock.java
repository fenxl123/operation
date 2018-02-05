package com.fx.multithread.produceconsumermodel.deadlock;

public class Deadlock implements Runnable {

	@Override
	public void run() {
		synchronized(this){
			boolean flag=true;
			while(flag){
				for(int i=0;i<5;i++){
					System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+"Êä³ö"+i);
				}
			}
		}
		
	}

}
