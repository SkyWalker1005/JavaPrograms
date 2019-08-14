package com.test.Test;

public class RemoveJunkChars {

	public static void main(String[] args) {
		String str="###$%^@&** Saitama #$!@&%$SENSAI^&$$%^";
		//Regular Expression
		String s=str.replaceAll("[^a-zA-Z0-9 ]","");
		System.out.println(s);
	}
}
