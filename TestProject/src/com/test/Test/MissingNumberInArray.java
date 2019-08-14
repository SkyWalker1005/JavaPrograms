package com.test.Test;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8,9,10};
		int sum=0;int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
		for(int j=1;j<=10;j++) {
			sum1+=j;
		}
		System.out.println(sum1);
		System.out.println("Missing: "+(sum1-sum));
	}
}
