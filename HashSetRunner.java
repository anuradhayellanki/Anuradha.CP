/**
 * 
 */
package com.cashapona.collections.may17;

import java.util.*;

/**
 * @author USER
 *
 */
public class HashSetRunner {

	/**
	 * create empty HashSet
	 */
	static Set<Integer> set_object=new HashSet<Integer>();
	
	
	/**
	 * add elements into HashSet
	 * 
	 * @param index
	 */
	public static void addElements() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many number of elements have to enter : ");
		int number=scanner.nextInt();
		for(int i=0;i<number;i++) {
			//reading set elements 
			System.out.println("Enter elements");
			
			int a=scanner.nextInt();
			set_object.add(a);
              
		}
		
		System.out.println(set_object);

	}
	
	

	/**
	 * traversing  elements in HashSet
	 * using enhanced for loop
	 */
	public static void traverseenhancedFor() {
		for(Integer number:set_object) {
			System.out.println("Traverse elemnets : "+number);
		}
	}
	
	/**
	 *get number of elements in HashSet
	 *
	 */
	/*public static void getElement(int index) {
		System.out.println("Get "+index+" in ArrayList  : "+ set_object.get(index));

	}
	*/
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling add method
		addElements();
		traverseenhancedFor();
	}

}
