/**
 * 
 */
package com.cashapona.collections.may19;

import java.util.*;

/**
 * @author USER
 *
 */
public class LinkedHashSetRunner {

	/**
	 * LinkedHashSet is a HashTable and LL implementation of set interface
	 * contains unique eles
	 * maintain insertion order
	 * permits null eles
	 * inherits the HashSet class and implements Set Interface
	 * create new LinkedHashSet of String type
	 */
	static LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>();

	
	/*
	 * add eles into LinkedHashSet
	 */
	public static void add() {
		
		linkedhashset.add(23);
		linkedhashset.add(34);
		linkedhashset.add(45);
		linkedhashset.add(56);
		linkedhashset.add(67);
		linkedhashset.add(67);
		linkedhashset.add(null);
		linkedhashset.add(null);

		System.out.println("LinkedHashSet : "+linkedhashset);
	}
	
	/*
	 * contains () returns true if object found else return false
	 */
	public static void contains() {
		if(linkedhashset.contains(67)) {
			System.out.println("Ele found in LinkedHashSet  ");
		}
		else {
			System.out.println("Ele  not found in LinkedHashSet  ");
		
		}
		
		
		}
	
		
	/*
	 * traversing eles using enhanced for loop	
	 */
	public static void enhancedFor() {
		System.out.println("Traversing using enhanced for");
		for(Integer s:linkedhashset) {
			System.out.println("LinkedHashSet : "+s);
		}
	}
		
	/*
	 * remove eles using remove()	
	 */
	
	public static void remove() {
		
			System.out.println("Enter string element to remove in LinkedHashSet  : ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
				int number=sc.nextInt();
				linkedhashset.remove(number);
				System.out.println(linkedhashset);
				enhancedFor();
		
	}
	
	
	/*
	 * traversing elements using iterate
	 */
	public static void iterate() {
		System.out.println("Traversing using iterator");
		Iterator<Integer> it=linkedhashset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/*
	 * if LikedHashSet is empty print true otherwise print false
	 */
	public static void isEmpty() {
		System.out.println("LHS  is empty"+linkedhashset.isEmpty());
	}
	
	/*
	 * count no of elements in LinkedHashSet using size()
	 */
	public static void size() {
		System.out.println("Size of LinkedHashSet : "+linkedhashset.size());

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int chioce;
		do {
			System.out.println("Select one option in the menu :");
			System.out.println("1 : add ");
			System.out.println("2 : remove");
			System.out.println("3 : iterate");
			System.out.println("4 : enhanced for");
			System.out.println("5 : contains ");
			System.out.println("6 : size");
			System.out.println("7 : isEmpty");


			System.out.println("Enter ur chioce :");
			chioce=sc.nextInt();
			switch(chioce) {
				
			case 1:
				 add();
				 break;
				 
			case 2:
				remove();
				break;
				
			case 3:
				iterate();
				break;
				
			case 4:
				enhancedFor();
				break;
				
			case 5:
				contains();
				break;
				
			case 6:
				size();
				break;
				
			case 7:
				isEmpty();
				break;
				
			case 8:
				break;
				
			default :
				System.out.println("Invalid option selected , try again");
			}
		}while(chioce!=8);
		}
		
		}
	}

