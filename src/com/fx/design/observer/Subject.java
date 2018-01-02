package com.fx.design.observer;

public interface Subject {
	void attach(Observer observer);
	void detch(Observer observer);
	void notify(String message);
}
