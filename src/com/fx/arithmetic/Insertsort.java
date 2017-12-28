package com.fx.arithmetic;

public class Insertsort {
	 public static void main(String[] args) {
	    	insertSort();
	 }
	 public static void insertSort(){
    	int[] in={6,7,0,9,3,5,2,4,1,8};
    	for(int i=1;i<in.length;i++){
    		int temp=in[i];
    		int j=i-1;
    		int pos=i;
    		for(;j>=0;j--){
    			if(temp<in[j]){
    				in[j+1]=in[j];
    				pos=j;
    			}
    		  	
    		}
    		in[pos]=temp;
    	}
    	for(int s:in){
    		System.out.println(s);
    	}
   }	
}
