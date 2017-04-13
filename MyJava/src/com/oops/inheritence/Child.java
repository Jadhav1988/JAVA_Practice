/**
 * 
 */
package com.oops.inheritence;

/**
 * @author mohan.jadhav
 *
 */
public class Child extends Parent{

	int sum;
	
	public void addition(){
		sum=a+b;
		System.out.println("Addition: " +sum);
	}
	
	
	public void substraction(){
		sum=a-b;
		System.out.println("Substraction: " +sum);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent=new Parent();
		Child child=new Child();
		child.addition();
		child.substraction();
		child.sum=parent.a+parent.b;
		System.out.println("Sum " +child.sum);

	}

}
