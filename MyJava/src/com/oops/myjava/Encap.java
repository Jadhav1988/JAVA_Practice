/**
 * 
 */
package com.oops.myjava;

/**
 * @author mohan.jadhav
 *
 */
public class Encap {

	// Variable declaration 
	private String empName;
	private int empId;
	private int empAge;


	// getter
	public int getAge(){
		return empAge;
	}

	// getter  
	public int getID(){
		return empId;
	}

	// getter  
	public String getName(){
		return empName;
	}


	// Setter 
	public void setAge(int newAge){
		empAge=newAge;
	}

	// Setter 
	public void setId(int newId){
		empId=newId;
	}

	// Setter 
	public void setName(String newName){
		empName=newName;
	}

}
