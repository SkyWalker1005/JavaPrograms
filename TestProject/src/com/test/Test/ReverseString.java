package com.test.Test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello Associate";
		String rev="";
		
		StringBuffer sf=new StringBuffer(str);
		System.out.println("Reverse: "+sf.reverse());
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse: "+rev);
	}

}
