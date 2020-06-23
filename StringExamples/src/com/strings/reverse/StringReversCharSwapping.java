package com.strings.reverse;

public class StringReversCharSwapping {

	public static void main(String[] args) {
		
		  String input = "Geeks For Geeks"; 
		  int left,right;
		   char temp; 
		  char[] ch = input.toCharArray(); 
		  right = ch.length-1; 
		  
		  for (left=0; left<right ; left++,right--)
		  {
			  temp = ch[left]; 
			  ch[left]=ch[right];
			  ch[right]=temp; 
		  }
		  System.out.println(ch); 
	}
  
}
