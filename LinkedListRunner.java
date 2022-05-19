/**
 * 
 */
package com.cashapona.collections.may18;

import java.util.*;

/**
 * @author USER
 *
 */

public class LinkedListRunner {

	 /*
	  * Creating empty LinkedList
	  * LL uses doubly linked list to store elements.
	  * allows duplicates values
	  * maintain insertion order
	  * manipulation is fast because no element shifting is needed.
	  */
	static LinkedList<Integer> list=new LinkedList<Integer>();
    

	/*
	 * add elements to LinkedList
	 * 
	 */
	
	public static void add(int data) {
			list.add(data);
		}
		
		
	/*
	 * check elements in LinkedList
	 * 
	 */
	
	public static void isEmpty() {
		System.out.println("Check LinkedList is empty : "+ list.isEmpty());
	}
	
	
	/*
	 * count number of elements in  LinkedList
	 * 
	 */
	
	public static void size() {
		System.out.println("Number of Objects in LinkedList : "+list.size());
		}
	
	
	/*
	 *remove elements in LinkedList
	 * 
	 * @param index
	 */
	public static void remove(int index) {
		System.out.println("Remove  : "+list.remove(index));
	}
	
	
	/*
	 * get elements in LinkedList
	 *  
	 *   @param index
	 *   
	 */
	public static void getElements(int index) {
		System.out.println("Get "+index+" position in LinkedList  : "+ list.get(index));
	}
	
	
	/*
	 * update LinkedList using set method
	 * 
	 *  @param index,data
	 */
	public static void updateElement(int index,int data) {
		System.out.println("Before update ");
		display();
		System.out.println("Update element of given position  with given value is "+list.set(index,data));
		System.out.println("After update");
		display();
	}
	
	
	/*
	 * search elements using contains()
	 * 
	 *  @param data
	 */
	
	public static void containsElement(int data) {
		if(list.contains(data)) {
			System.out.println("Element found in LinkedList");
		}
		else {
			System.out.println("Element "+data+" not found in LinkedList");

			}
		}
	
	/*
	 * traversing elements using iterator
	 * 
	 */
	public static void display() {
		System.out.print("LinkedList elements : ");
	
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
	}
	

	/*
	 * traversing elements using decendingIterator
	 * 
	 */
	public static void decendingIterator() {
		System.out.print("LinkedList elements using decendingIterator: ");
	
		Iterator<Integer> it= list.descendingIterator();  
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
	}
	

	
	/*
	 *add element in particlar position in LinkedList
	 * 
	 *  @param index, data
	 */
	public static void addElementAtPosition(int index,int data) {
		try {
				list.add(index,data);
				System.out.println("After adding  element in position "+index+" in LinkedList : " +list);
		}
		catch(Exception e) {
			System.out.println("We can't add element in position " +index+" in LinkedList");
		}
	}
	
	
	/*
	 * remove duplicates in LinkedList using HashSet
	 * 
	 */
	public static void removeDuplicates() {
		HashSet<Integer> hashSetobject=new HashSet<Integer>(list);
		System.out.println("Remove duplicates : "+hashSetobject);
	}
	
	/**
	 * to display the elements and their positions in a linked list.
	 */
	public static void displayEleAndTheirPosition() {
		System.out.println("Original LL : "+list);
		for(int i=0;i<list.size();i++)
			System.out.println("Element at "+i+" : "+list.get(i));

	}
	
	/*
	 *   retrieve ele but does not remove, the first and last element in linked list. 
	 */
	public static void peek() {
		System.out.println();
		System.out.println("Retrieve first ele but not remove in LL : "+list.peekFirst());
		System.out.println("Retrieve last ele but not remove in LL : "+list.peekLast());
		System.out.println("After peek()  : ");
		display();
		System.out.println();

	}
	
	
	/*
	 *   retrieve ele and remove the first and last element in linked list. 
	 */
	public static void poll() {
		System.out.println();
		System.out.println("Retrieve first ele and remove in LL : "+list.pollFirst());
		System.out.println("Retrieve last ele and remove in LL : "+list.pollLast());
		System.out.println("After poll()  : ");
		display();
	}
	
	/**
	 * add first and last eles in LL using offerFirst and offerLast

	 */
	public static void offer() {
		list.offerFirst(1);
		System.out.println("insert ele at first position in LL using offerFirst : "+list);
		list.offerLast(2);
		System.out.println("insert ele at last position in LL using offerLast : "+list);
		System.out.println();
	}
	
	
	/**
	 * add first and last eles in LL using addFirst and adderLast

	 */
	public static void addFirstAndLast() {
		list.addFirst(300);
		System.out.println("insert ele at first position in LL using addFirst : "+list);
		list.addLast(200);
		System.out.println("insert ele at last position in LL using addLast : "+list);
		System.out.println();
	}
	
	/**
	 * getFirst ele and getLast ele in LL
	 */
	public static void getFirstAndLast() {
		System.out.println("first occurence of ele in LL using getFirst: "+list.getFirst());
		System.out.println("Last occurance of ele in LL using getLast: "+list.getLast());
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	  
	    // size of // size of arraylist
		size();
		
		
		//isempty()
		isEmpty();
		
		//calling addElemens method
		
		System.out.println("Add eles into LinkedList");
		add(12);
		add(2);
		add(200);
		add(100);
		add(12);
		
		//traversing LinkedList 
		display();
		System.out.println();
		
		//remove elements
		remove(2);	
		System.out.println("After remove ");
		display();
		System.out.println();
		
		//get eles
		getElements(1);
		
		
		//update elements using set()
		updateElement(1,100);
		
			
		//contains  method 
		System.out.println();
		containsElement(100); 
		
		
		//addElementAtPosotion
		addElementAtPosition(2,90);
		addElementAtPosition(20,90);
		addElementAtPosition(6,56);

			
		//decendingIterator() 
		decendingIterator() ;
		System.out.println();

		//add first and last eles in LL using addFirst
		addFirstAndLast();
		
		//add first and last eles in LL using offerFirst
		offer();
		
		//remove duplicates
		removeDuplicates();
		
		//getFirst,getLast ele in LL
		getFirstAndLast();
		
		//display eles with thr positions
		System.out.println();
		displayEleAndTheirPosition();
		
		peek() ;
		
		poll();
		
	}


	
}
 
		