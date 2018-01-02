package com.fx.design;

import sun.security.jca.GetInstance;

public class Singleton {
	private static Singleton singleton;
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