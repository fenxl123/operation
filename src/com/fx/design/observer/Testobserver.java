package com.fx.design.observer;

public class Testobserver {
	public static void main(String[] args) {
		Observer wxobserver=new Wxobserver("С��");
		Observer wxobserver1=new Wxobserver("С��");
		Subject subscription =new SubscriptionSubject();
		subscription.attach(wxobserver);
		subscription.attach(wxobserver1);
		subscription.notify("С���Ѽ����Ⱥ");
	}
}
