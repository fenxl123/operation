package com.fx.design.observer;

public class Testobserver {
	public static void main(String[] args) {
		Observer wxobserver=new Wxobserver("小月");
		Observer wxobserver1=new Wxobserver("小兰");
		Subject subscription =new SubscriptionSubject();
		subscription.attach(wxobserver);
		subscription.attach(wxobserver1);
		subscription.notify("小月已加入该群");
	}
}
