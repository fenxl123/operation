package com.fx.design.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {
	private List<Observer> list=new ArrayList<Observer>();
	@Override
	public void attach(Observer observer) {
		list.add(observer);
		
	}

	@Override
	public void detch(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}

	@Override
	public void notify(String message) {
		for(Observer observer:list){
			observer.update(message);
		}
		
	}

}
