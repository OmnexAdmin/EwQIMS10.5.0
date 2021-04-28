package practice;

import java.util.HashMap;
import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		 //reverse string learning
		  
		  Scanner scan= new Scanner(System.in);
		  System.out.println("Enter your string");
		  
		  String x=scan.nextLine();
		  System.out.println("Enter your integer"); 
		  int len= x.length();
		  System.out.println("lenght of the string is:" +len);
		  
		  String reverse ="";
		  
		  for (int i = len-1; i >= 0; i--) {
		  
		  
		  reverse=reverse +x.charAt(i);
		  
		  
		  } System.out.println(reverse);
		 
		 
	
	
	
	
	}
	
	}


