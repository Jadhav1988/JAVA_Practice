/**
 * 
 */
package com.java.practice;

import java.util.Scanner;

/**
 * @author mohan.jadhav
 *
 */
public class PalindromNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=0;
		
		System.out.println("Enter number");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		
		int n=number;
		int temp=0;
		int revrese=0,i=0;
		
		if(String.valueOf(number).equals(new StringBuilder(String.valueOf(n)).reverse().toString())){
			System.out.println("Bingo");
		}
		else{
			System.out.println("Ohhh");
		}
		
		while(n>0){
			temp=n%10;
			n=n/10;
			revrese=revrese*10 + temp;
			//System.out.println(temp+" "+revrese+" "+number);
			//System.out.println("Is palindrom" +revrese);
		}
		System.out.println(revrese);
		if(number==revrese){
			System.out.println("Bingo");
		}
		else{
			System.out.println("Ohhhhhhhhhhhhh");
		}
		
		
		
		 

	}

}
