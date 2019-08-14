package com.test.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String[] names= {"Selenium","Java","TestNG","Maven","Jenkins","RestAssured","TestNG","Java","Java"};  
		//O(n)2
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate Element: "+names[i]);
				}
			}
		}
		
		//O(n)
		Set<String> str=new HashSet<String>();
		for(String name:names) {
			if(str.add(name)==false) {
				System.out.println("Duplicate Element is: "+name);
			}
		}
		
		//Map
		Map<String,Integer> storeMap=new HashMap<String,Integer>();
		for(String name:names) {
			Integer count=storeMap.get(name);
			if(count == null) {
				storeMap.put(name,1);
			}
				else
					storeMap.put(name,++count);
			
		}
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();  
		for(Entry<String,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate Element in array is: "+entry.getKey()); 
			}
		}
	}
}
