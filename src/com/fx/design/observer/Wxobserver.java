package com.fx.design.observer;

public class Wxobserver implements Observer{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wxobserver(String name){
		this.name=name;
	}
	@Override
	public void update(String message) {
		System.out.println(name+"-"+message);
		
	}

}
