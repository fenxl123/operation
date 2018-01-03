package com.fx.design.decorator;

public class Testdecorator {
	public static void main(String[] args) {
		 TheGreatestSage sage = new Monkey();
		  Fish fish=new Fish(sage);
		  fish.move();
          sage.move();
	}
}
