package com.fx.arithmetic;

public class Bubblesort {
	public static void bubbleSort(){
		boolean flag=true;
		int[] a={0,2,8,7,6,5,3,4,9};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}
		for(int s:a){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		bubbleSort();
	}
}
