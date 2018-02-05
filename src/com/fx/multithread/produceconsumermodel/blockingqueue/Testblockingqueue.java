package com.fx.multithread.produceconsumermodel.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Testblockingqueue {
	public static void main(String[] args) {
		BlockingQueue queue =new LinkedBlockingDeque();
		Thread thread1=new Thread(new Producer(queue));
		Thread thread2=new Thread(new Consumer(queue));
		thread1.start();
		thread2.start();
	}
}
