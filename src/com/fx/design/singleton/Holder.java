package com.fx.design.singleton;

public class Holder {
	//holderģʽ�������˶���ģʽ�ľ�̬�������̰߳�ȫ���м��ʵ����������
  private static class SingletonHolder{
	  private static Holder holder =new Holder();
  }
  private Holder(){
	  
  }
  public synchronized static Holder getInstance(){
	return SingletonHolder.holder;
	  
  }
}
