package com.fx.design.decorator;

public class Change implements TheGreatestSage{
	private TheGreatestSage theGreatestSage;
	public Change(TheGreatestSage theGreatestSage){
		this.theGreatestSage=theGreatestSage;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		theGreatestSage.move();
	}

}
