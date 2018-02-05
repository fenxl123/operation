package com.fx.multithread.produceconsumermodel.simulation;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Myblockingqueue {
	//1.需要集合封装数据
	private LinkedList list=new LinkedList();
	private int minsize=0;
	private int maxsize;
	private AtomicInteger count =new AtomicInteger(0);
	public Myblockingqueue(int maxsize){
		this.maxsize=maxsize;
	}
	private Object lock=new Object();
	public void put(Object obj){
		synchronized(lock){
			while(count.get()==this.maxsize){
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			list.add(obj);
			count.incrementAndGet();
			lock.notify();
			System.out.println("新加入的元素为:" + obj);
			
		}
		
	}
	public Object take(){
		Object ret = null;
		synchronized(lock){
			while(count.get()==this.minsize){
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				ret=list.removeFirst();
				count.decrementAndGet();
				lock.notify();
			
		}
		return ret;
	}
	public int getSize(){
		
		return this.count.get();
		
	}
	
}
