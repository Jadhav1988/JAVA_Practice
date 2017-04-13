/**
 * 
 */
package com.java.basic.exercise;

import java.util.Scanner;

/**
 * @author mohan.jadhav
 *
 */
public class Excercise_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);

		System.out.println("Input first Number:");
		int num1=in.nextInt();

		for(int i=1; i<=10; i++){
			System.out.println(num1 + " X " + i + " = " + (num1 * i));
		}

	}

}
