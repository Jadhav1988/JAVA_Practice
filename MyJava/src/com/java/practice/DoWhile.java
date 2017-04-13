/**
 * 
 */
package com.java.practice;

/**
 * @author mohan.jadhav
 *
 */
public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Initialization of loop variable
		int i=4;

		do{

			// loop body 
			// By default the do block will execute once irrespective of the condition
			if(i>2){
				System.out.println("print i: " +i);
				i--;			
			}
			// condition/expression - the condition will only returns the boolean value true or false
		}while(i>=0);
	}

}
