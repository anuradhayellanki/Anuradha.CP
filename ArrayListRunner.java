
package com.cashapona.collections.may16;

import java.util.*;

/**
 *ArrayList methods implementation
 *
 *
 */


public class ArrayListRunner {

		
	/*
	 * create empty ArrayList
	 * 
	 */
	static ArrayList<Integer> arrayListObject=new ArrayList<Integer>();
	
	
	
	/*
	 * add elements to an ArrayList
	 * 
	 * @parameter data
	 */
	private static void addElements(int data) {
		// TODO Auto-generated method stub
		//ArrayList arrayListObject = new ArrayList();
		
		arrayListObject.add(data);
		
		
	}
	
	
	/*
	 * check elements in ArrayList
	 * 
	 */
	
	public static void isEmpty() {
		System.out.println("Check arralist is empty : "+ arrayListObject.isEmpty());
	}
	
	
	/*
	 * count number of elements in  ArrayList
	 * 
	 */
	
	public static void sizOfArrayList() {
		System.out.println("Size of ArrayList : "+arrayListObject.size());
		}
	
	
	/*
	 *remove elements in ArrayList
	 * 
	 * @param index
	 */
	public static void removeElement(int index) {
		System.out.println("After remove ArrayList : "+arrayListObject.remove(index));
	}
	
	
	/*
	 * get elements in AarrayList
	 *  
	 *   @param index
	 *   
	 */
	public static void getElements(int index) {
		System.out.println("Get "+index+" in ArrayList  : "+ arrayListObject.get(index));
	}
	
	
	/*
	 * update ArrayList using set method
	 * 
	 *  @param index,data
	 */
	public static void updateElement(int index,int data) {
		System.out.println("set element of given position  with given value is "+arrayListObject.set(index,data));
	}
	
	
	/*
	 * search elements using contains()
	 * 
	 *  @param data
	 */
	public static void containsElement(int data) {
		if(arrayListObject.contains(data)) {
			System.out.println("Element found in ArrayList");
		}
		else {
			System.out.println("Element "+data+" not found in ArrayList");

			}
		}
	
	/*
	 * traversing elements using iterator
	 * 
	 */
	public static void display() {
		System.out.println("ArrayList elements : ");
	
		Iterator<Integer> it=arrayListObject.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
	}
	
	/*
	 *sorting ArrayList
	 * 
	 */
	public static void sort() {
		Collections.sort(arrayListObject);
		System.out.println("After sorting ArrayList : " +arrayListObject);
	}
	
	
	
	/*
	 *add element in particlar position in  ArrayList
	 * 
	 *  @param index, data
	 */
	public static void addElementAtPosition(int index,int data) {
		try {
				arrayListObject.add(index,data);
				System.out.println("After adding  element in ArrayList : " +arrayListObject);
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	
	
	/*
	 * remove duplicates in ArrayList using HashSet
	 * 
	 */
	public static void removeDuplicates() {
		HashSet<Integer> hashSetobject=new HashSet<Integer>(arrayListObject);
		System.out.println("Remove duplicates : "+hashSetobject);
	}
	public static void main(String[] args) {
			
			// size of arraylist
			sizOfArrayList();
			
			
			//isempty()
			isEmpty();
			
			//calling addElemens method
			addElements(20);
			addElements(220);
			addElements(2);
			addElements(20);
	
			//traversing arraylist 
			display();
			System.out.println();
			
			//remove elements
			removeElement(2);		
			display();
			System.out.println();
			
			//get eles
			getElements(1);
			
			
			//update elements using set()
			updateElement(1,1090);
			System.out.println();
			display();

			
			//contains  method calling
			System.out.println();
			containsElement(100); 
			
			
			//addElementAtPosotion
			addElementAtPosition(4,3);
			addElementAtPosition(2,3);

			
			//sort
			sort();
			
			//remove duplicates
			removeDuplicates();
			
		}

	}
	
	
	
		


	
		
	