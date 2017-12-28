package com.fx.arithmetic;

public class Selectsort {
      public static void main(String[] args) {
		selectSort();
		
	  }
      public static void selectSort(){
	    	int[] se={0,5,7,9,8,4,3,2,1};
	    	for(int i=0;i<se.length;i++){
	    		int minvalue=se[i];
	    		int pos=i;
	    		for(int j=i+1;j<se.length;j++){
	    			if(minvalue>se[j]){
	    				minvalue=se[j];
	    				pos=j;
	    			}
	    		}
	    		se[pos]=se[i];
	    		se[i]=minvalue;
	    		
	    	}
	    	for(int c:se){
	    		System.out.println(c);
	    	}
	      }
}
