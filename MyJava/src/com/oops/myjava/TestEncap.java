/**
 * 
 */
package com.oops.myjava;

/**
 * @author mohan.jadhav
 *
 */
public class TestEncap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap encapsulation=new Encap();

		encapsulation.setAge(20);
		encapsulation.setId(87523);
		encapsulation.setName("Kumar Mohan");

		System.out.println("Name: " +encapsulation.getName() +"\n"+"Age: " +encapsulation.getAge() +"\n"+"Id: " +encapsulation.getID());

		
		encapsulation.setAge(30);
		encapsulation.setId(1234);
		encapsulation.setName("Test Encap");

		System.out.println("Name: " +encapsulation.getName() +"\n"+"Age: " +encapsulation.getAge() +"\n"+"Id: " +encapsulation.getID());

	}

}
