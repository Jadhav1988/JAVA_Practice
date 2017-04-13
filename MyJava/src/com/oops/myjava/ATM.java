/**
 * 
 */
package com.oops.myjava;

import java.util.Scanner;

/**
 * @author mohan.jadhav
 *
 */
public class ATM {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int avilableAmount=1500;
		int atmMoney=1000;
		int numberOfTry=3;

		Scanner scan=new Scanner(System.in);
		for(int i=1; i<=numberOfTry; i++){
			System.out.println("Enter Your Secret Pin:");

			int pin=scan.nextInt();
			if(pin==6524){
				System.out.println("Enter Required amount:");

				int amount=scan.nextInt();
				if(amount<100){
					System.out.println("Please enter amount greater than 100-/:");
				}
				else if(amount>10000){
					System.out.println("Please enter amount less than 10000-/:");
				} 
				else{
					System.out.println("Please wait your transaction is beaing proced...");
					if(avilableAmount>=amount){
						if(atmMoney>=amount){
							if(amount%100==0){
								System.out.println("Please collect cash...");
								int amontavilable=avilableAmount-amount;
								System.out.println("Avilable amount after dedection: "+amontavilable);
								break;
							}else {
								System.out.println("Enter amount in hundreads...");
								break;
							}
						}else {
							System.out.println("dont have sufficient fund in ATM.. " +atmMoney+ " Do u want to continue Yes or Anykey");
							String continueTranscation=scan.next();
							if(continueTranscation.equalsIgnoreCase("Yes")){
								System.out.println("Please collect cash...");
								int amontavilable=avilableAmount-atmMoney;
								System.out.println("Avilable amount after dedection: "+amontavilable);
								break;
							}else{
								break;
							}
						}
					}
					else{
						System.out.println("Dont have sufficent balance account: " +avilableAmount + " Do u want to draw avilable amount only Yes or anykey ");
						String continueTransac=scan.next();
						if(continueTransac.equalsIgnoreCase("Yes")){
							System.out.println("Please collect cash...");
							int amontavilable=avilableAmount-amount;
							if(amontavilable<=0){
								System.out.println("Avilable amount after dedection: " + 0.00);
								break;
							}else{
								System.out.println("Avilable amount after dedection: "+amontavilable);
							}
						}
						else{
							break;	
						}

					}
				}
			}
			else{
				System.out.println("Authontication failed... Try once");
			}

		}

	}

}
