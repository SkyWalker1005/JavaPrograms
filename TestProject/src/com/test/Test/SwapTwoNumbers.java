package com.test.Test;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		//Using third variable
		int x=5;
		int y=7;
		int z;
		
		z=x;
		x=y;
		y=z;
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
		
		//Without third variable
		
//		int a=5;
//		int b=7;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("Value of a:"+a);
//		System.out.println("Value of b:"+b);
		
//		int a=5;
//		int b=7;
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("Value of a:"+a);
//		System.out.println("Value of b:"+b);
		
		int a=5;
		int b=7;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
}
