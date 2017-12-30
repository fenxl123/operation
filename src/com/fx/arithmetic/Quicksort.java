package com.fx.arithmetic;

public class Quicksort {
	public static void main(String[] args) {
		int[] a={0,4,2,3,5,9,7,8,6};
		int left=0;
		int hight=a.length-1;
		quickSort(left,a,hight);
		for(int s:a){
			System.out.println(s);
		}
		
	}
	public static void quickSort(int left,int[] arr,int hight){
		if(left<hight){
			int	ops=findops(left, arr, hight);
			quickSort(left,arr,ops-1);
			quickSort(ops+1,arr,hight);
		}
	}
	public static int findops(int left,int[] arr,int hight){
		int key=arr[left];
		if(left<hight){
		while(hight>left&& arr[hight]>=key){
				   hight--;
			}
			arr[left]=arr[hight];
			while(left<hight && arr[left]<key){
				left++;
			}
			arr[hight]=arr[left];
		}
	   arr[left]=key;
	   return left;
	   
	}
}
