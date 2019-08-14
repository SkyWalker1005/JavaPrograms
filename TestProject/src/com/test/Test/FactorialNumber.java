package com.test.Test;

public class FactorialNumber {
	
	public static int fact(int num) {
		int fact=1;
		if(num==0)
			return fact;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static int factorial(int num) {
		if(num==0)
			return 1;
		else 
			return num*(factorial(num-1));
}
	public static void main(String[] args) {
		System.out.println(factorial(2));
		System.out.println(factorial(2));
	}
}
