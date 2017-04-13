package com.oops.inheritence;

import java.util.Scanner;

public class Child1{

	//static String name ="mohanaa";
	
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println("String length: "+name.length());
		int count=0;
		for(int i=0; i<name.length(); i++){
			if(name.charAt(i)==c){
				count++;
			}	
		}
		System.out.println(c+" Count : "+count);
		
	}

}
