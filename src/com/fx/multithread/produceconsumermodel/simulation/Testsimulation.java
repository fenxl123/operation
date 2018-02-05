package com.fx.multithread.produceconsumermodel.simulation;

import java.util.concurrent.TimeUnit;

public class Testsimulation {
	public static void main(String[] args) {
		 final Myblockingqueue queue=new Myblockingqueue(5);
		queue.put(1);
		queue.put(2);
		queue.put(3);
		queue.put(4);
		queue.put(5);
		System.out.println("当前队列的长度："+queue.getSize());
		Thread thread=new Thread(new Runnable(){

			@Override
			public void run() {
				queue.put(6);
				queue.put(7);
			}
			
		});
		thread.start();
		Thread thread2=new Thread(new Runnable(){

			@Override
			public void run() {
				Object obj1=queue.take();
				System.out.println("移除的元素为："+obj1);
				Object obj2=queue.take();
				System.out.println("移除的元素为："+obj2);

			}
			
		});
		
		try {
			TimeUnit.SECONDS.sleep(2);//睡眠2s才启动线程2
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
