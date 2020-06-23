package com.strings.reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverseLinkedList {

	public static void main(String[] args) {
		
		String input = "Geeks For Geeks"; 
		List<Character> Al = new ArrayList<>(); 
		
		char[] ch = input.toCharArray(); 
		 	
		for( char c : ch)
		{
			Al.add(c); 
		}
		Collections.reverse(Al);
		
		System.out.println(Al); 
		
		ListIterator li = Al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
			
		}
		
		 
		
	}

}
