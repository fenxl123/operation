package com.fx.design.singleton;

public class Holder {
	//holder模式，利用了饿汉模式的静态变量和线程安全，有间接实现了懒加载
  private static class SingletonHolder{
	  private static Holder holder =new Holder();
  }
  private Holder(){
	  
  }
  public synchronized static Holder getInstance(){
	return SingletonHolder.holder;
	  
  }
}
