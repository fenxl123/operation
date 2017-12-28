package com.fx.arithmetic;

public class Shellsort {
    public static void shellSort(){
    	int[] shell={0,8,6,4,9,5,7,3,2,1};
    	int len=shell.length;
    	int group=len/2;
    	for(;group>0;group/=2){
    		for(int i=group;i<len;i++){
    			int temp=shell[i];
    			int j=i-group;
    			for(;j>=0;j-=group){
    				if(temp<shell[j]){
    					shell[j+group]=shell[j];
    					shell[j]=temp;
    				}
    			}
    		}
    	}
    	for(int s:shell){
    		System.out.println(s);
    	}
    }
    public static void main(String[] args) {
    	shellSort();
	}
}
