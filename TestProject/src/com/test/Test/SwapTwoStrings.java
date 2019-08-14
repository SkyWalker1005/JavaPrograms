package com.test.Test;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a="Hello";
		String b="World!";
		
		a=a+b; //HellowWorld
		b=a.substring(0, a.length()-b.length()); //Hello
		a=a.substring(b.length());
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		
	}
}
