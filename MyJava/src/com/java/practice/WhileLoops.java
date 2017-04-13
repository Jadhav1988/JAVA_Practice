/**
 * 
 */
package com.java.practice;


/**
 * @author mohan.jadhav
 *
 */
public class WhileLoops {

	public static void main(String[] args) {
		
		// Initialization of the loop variables 
		
		int i=0, count=0;
		
		
		// condition/expression is should be in while 
		while(i<5){

			// if while returns true then only the loop body will execute
			// loop body 
			if((i%2)!=0){
				System.out.println("odd number: " +i);	
				count++;
			}
			// increment/decrement based upon the condition
			i++;
		}
		// out side the  loop body 
		System.out.println("Total numbers: "+count);
	}

}


