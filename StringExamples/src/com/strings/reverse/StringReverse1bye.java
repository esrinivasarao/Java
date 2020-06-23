package com.strings.reverse;

class StringReverse1bye

{ 
    public static void main(String[] args) 
    { 
        String input = "GeeksforGeeks"; 
  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] b = input.getBytes(); 
  
        byte [] result =  
                   new byte [b.length]; 
        int j= 0; 
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = b.length-1; i>=0; j++, i--) 
            result[j] =  b[i]; 
  
        System.out.println(new String(result)); 
    } 
} 
