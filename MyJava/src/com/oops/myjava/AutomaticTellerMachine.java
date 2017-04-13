/**
 * 
 */
package com.oops.myjava;

import java.util.Scanner;

/**
 * @author mohan.jadhav
 *
 */
public class AutomaticTellerMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int accountBalance=2000, atmAmount=500, numberOfTry=3;

		Scanner scan=new Scanner(System.in);
		for(int i=1; i<=numberOfTry; i++){
			System.out.println("Enter secret pin: ");
			int pincode=scan.nextInt();
			if(pincode==1234){	
				System.out.println("Enter Required Amount");
				int requireAmount=scan.nextInt();

				if(requireAmount%100==0){

					if(requireAmount<=accountBalance && requireAmount<=atmAmount){
						//Do something
					} 
					else if(requireAmount>=accountBalance && requireAmount<=atmAmount){
						System.out.println("Entered amount is greater than account balance.");
						System.out.println("Do you want to proceed with available account balance?");
						String choice=scan.next();

						if(choice.equalsIgnoreCase("yes")){
							//Do something
						}
					}
					else if(requireAmount<=accountBalance && requireAmount>=atmAmount){
						System.out.println("Entered amount is greater than ATM balance.");
						System.out.println("Do you want to proceed with available ATM balance?");
						String choice=scan.next();

						if(choice.equalsIgnoreCase("yes")){
							//Do something
						}
					}
					else{
						int min=0;
						if(atmAmount<=accountBalance){
							min=atmAmount;
						}
						else{
							min=accountBalance;
						}
						
					}
				}
				else{
					System.out.println("Please Enter Amount in Hundreds: ");
				}
			}
			else{
				System.out.println("Authontication failed please try again...");
			}
		}
	}

}
