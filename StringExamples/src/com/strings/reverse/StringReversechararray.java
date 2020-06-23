package com.strings.reverse;

public class StringReversechararray {

	public static void main(String[] args) {

		String input = "Geeks for Geeks"; 
		char[] ch = input.toCharArray();
		char[] result = new char[ch.length];
		int j=0; 
		
		/*
		 * for( int i=ch.length-1; i>=0; i--,j++ ) { result[j]=ch[i]; }
		 */
		//or without second variable j 
		
		for( int i=0; i<=ch.length-1; i++ )
		{
		   result[i]=ch[ch.length-1-i]; 
		}
         System.out.println(result); 
	}

}
