package com.fx.arithmetic;

public class Binarychop {
	public static void binaryChop(){
		int[] arr={0,1,2,3,4,5,6,7,8,9,10};
		int s=5;
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			int mid =(left+right)/2;
			if(s==arr[mid]){
				System.out.println("�ҵ���Ԫ�أ�λ����"+mid);
				return;
			}
			else if(s<arr[mid]){
				 right=mid-1;
			}
			else{
				 left=mid+1;
			}
	   }
	   System.out.println("û�и���ֵ");
	}
	public static void main(String[] args) {
		binaryChop();
	}
}
