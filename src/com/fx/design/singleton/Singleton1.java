package com.fx.design.singleton;

public class Singleton1 {
	//����ģʽ�����ľ��������أ���һ��ʹ�õ�ʱ���ڼ��أ��ô��ٶȿ죬�����Ǵ��ھ����������̲߳���ȫ)
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
