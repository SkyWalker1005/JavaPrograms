package com.test.Test;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=12331;
		int rev=0;
		int t=num;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==t) {
			System.out.println(t+" is Palindrome");
		}
	}
}
