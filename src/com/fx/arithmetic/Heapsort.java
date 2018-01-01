package com.fx.arithmetic;

public class Heapsort {
	public static void heapSort(int[] arr){
		for(int i=arr.length/2-1;i>=0;i--){
			adustheap(arr,i,arr.length);
		}
		for(int j=arr.length-1;j>=0;j--){
			swap(0,j,arr);
			adustheap(arr,0,j);
		}
		
	}

	public static void swap(int i, int j,int[] arr) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;	
	}

	public static void adustheap(int[] arr,int i,int len) {
		int temp=arr[i];
		for(int k=2*i+1;k<len;k=2*k+1){
			if(k+1<len&& arr[k]<arr[k+1]){
				k++;
			}
			if(arr[k]>temp){
				arr[i]=arr[k];
				i=k;
			}
			
		}
		arr[i]=temp;
	}
	public static void main(String[] args) {
		int[] arr={4,6,8,9,2,0,5,1,3};
		heapSort(arr);
		for( int s :arr){
			System.out.println(s);
		}
	}
}
