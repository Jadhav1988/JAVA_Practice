/**
 * 
 */
package com.java.strings;

import java.util.HashMap;
import java.util.Scanner;


/**
 * @author mohan.jadhav
 *
 */
public class Excersise {

	/**
	 * @param args
	 */

	public static  int[] returnCout(String str){
		int array[]=new int[26];
		for(int i=0; i<str.length(); i++){
			array[str.charAt(i)-'a']++;	
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]=returnCout("mohan");
		int array2[]=returnCout("hamon");
		boolean bol=false;

		for(int i=0; i<26; i++){
			if(array1[i]==array2[i]){
				continue;
			}
			else {
				bol=true;
			}

		}
		if(bol){
			System.out.println("Not Anagram");
		}
		else {
			System.out.println("Anagram...");
		}
		
		HashMap<Character,Integer> hm1 = new HashMap<>();
		HashMap<Character,Integer> hm2 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		for(int i=0;i<s1.length();i++){
			if(hm1.containsKey(s1.charAt(i))){
				hm1.put(s1.charAt(i), hm1.get(s1.charAt(i))+1);
			}
			else{
				hm1.put(s1.charAt(i), 1);
			}
		}
		
		for(int i=0;i<s2.length();i++){
			if(hm2.containsKey(s2.charAt(i))){
				hm2.put(s2.charAt(i), hm2.get(s2.charAt(i))+1);
			}
			else{
				hm2.put(s2.charAt(i), 1);
			}
		}
		
		System.out.println("Map1" +hm1 + " map2" +hm2);
		
		if(hm1.equals(hm2)){
			System.out.println("Anagram");
		}
		else{
			System.out.println("haha");
		}
	}


}


