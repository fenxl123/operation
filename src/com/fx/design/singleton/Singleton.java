package com.fx.design.singleton;

import sun.security.jca.GetInstance;

public class Singleton {
	//�������ô����̰߳�ȫ��ʹ��ʱû���ӳ٣���������Դ�˷ѣ��������غ�һֱ��ʹ�õ����Ļ���
	//���ڱ�����Ҫ���������������ܷ������š�
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