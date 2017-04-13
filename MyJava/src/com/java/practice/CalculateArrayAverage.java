/**
 * 
 */
package com.java.practice;

/**
 * @author mohan.jadhav
 *
 */
public class CalculateArrayAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declaration and initialization of some variables
		int numbers[]={12,14,52,45,85,65};
		int sum=0, Avreage, arrayLegnth=numbers.length;
		
		// Process continue till end of the array
		for(int i=0; i<arrayLegnth; i++){
			
			// Performing addition of array elements and storing the value to the "Sum" variable.
			sum=sum+numbers[i];		
		}
		
		// Calculating the average i.e, sum of the array divided by the number of element. 
		Avreage=(sum/arrayLegnth);
		
		// Displaying the answer on the screen.
		System.out.println("Sum of the array: " +sum + " And the average is: " + Avreage);
	}
}


