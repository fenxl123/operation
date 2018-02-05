package com.fx.design.singleton;

import sun.security.jca.GetInstance;

public class Singleton {
	//饿汉（好处是线程安全，使用时没有延迟，坏处是资源浪费（如果类加载后一直不使用单利的话）
	//由于饱汉需要加锁，饿汉的性能反而更优。
	private static Singleton singleton=new Singleton();
	private Singleton(){};
	public static Singleton getInstance(){
		if(singleton ==null){
			singleton=new Singleton();
		}
		return singleton;
		
	}
	
}
class Demo {
	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
	}
 }