package com.test.Test;

public class ReverseNumber {

	public static void main(String[] args) {
		long num=2342463;
		long rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse: "+rev);
	}
}
