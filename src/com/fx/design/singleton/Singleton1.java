package com.fx.design.singleton;

public class Singleton1 {
	//饱汉模式（核心就是懒加载，第一次使用的时候在加载，好处速度快，坏处是存在竞争条件，线程不安全)
	private static Singleton1 singleton=null;
	private Singleton1 (){
		
	}
	public  static Singleton1 getInstance(){
		if(singleton==null){
			singleton=new Singleton1();
		}
		return singleton;
		
	}
	public static void main(String[] args) {
		System.out.println(Singleton1.getInstance());
		
	}
}
