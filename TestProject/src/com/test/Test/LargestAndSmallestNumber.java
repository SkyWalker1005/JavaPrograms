package com.test.Test;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {-88,-24,0,8,-100,9899,-4,153};
		int largest= num[0];
		int smallest= num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
			else if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		
		System.out.println("Array is:"+Arrays.toString(num));
		System.out.println("Largest number is:"+largest);
		System.out.println("Smallest number is:"+smallest);
	}

}
