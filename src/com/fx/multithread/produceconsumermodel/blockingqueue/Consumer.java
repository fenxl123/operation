package com.fx.multithread.produceconsumermodel.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private final BlockingQueue queue;
	public Consumer (BlockingQueue queue){
		this.queue=queue;
	}
	
	@Override
	public void run() {
		while(true){
				try {
					System.out.println("consumer"+queue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}

}
