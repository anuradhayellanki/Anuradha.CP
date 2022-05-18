/**
 * 
 */
package com.cashapona.collections.may17;

import java.util.*;

/**
 * @author USER
 *
 */
public class HashMapOperations {

	
	/**
	 * create empty HashMap
	 * allows only one null key
	 * does not alloes duplicate keys,allow duplicate values
	 * preserve insertion order
	 * 
	 */
	
	static HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
	

	/**
	 * insert an entry in the HashMap using put()
	 *
	 */
	@SuppressWarnings("resource")
	public static void put() {
		int k ;
		String v;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements have to enter ");
		int number=sc.nextInt();

		for(int i=0;i<number;i++) {
			System.out.println("Enter key  into HashMap");
			k=sc.nextInt();
			System.out.println("Enter value into HashMap");

			 v=sc.next();
			hash_map.put(k,v);
			

		}
			
	}
	
	

	/**
	 * remove elements using remove()
	 * 
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static void remove() {
		System.out.println("REmove element : "+hash_map.remove(hash_map.remove(2)));
	}
	
	
	/**
	 * traversing HashMap Elemetns using enhanced for
	 * 
	 */
	public static void traverseEmhancedFor() {
		
		System.out.println("traverse elements using enhanced for : ");
		for(Map.Entry<Integer,String> map:hash_map.entrySet()) {
			System.out.println(map.getKey()+" , "+map.getValue());
		}
	}
	
	
	/**
	 * traversing HashMap elements using for-Each
	 * 
	 */
	public static void forEach() {
		
		System.out.println("traverse elements using forEach : ");
		hash_map.forEach((k,v)->{
			System.out.println("Key : " +k+" , "+"value : "+v);
			});

	}
	
	
	/**
	 * traversing using Iterator
	 * 
	 */
	public static void iterator() {
	@SuppressWarnings("rawtypes")
	
	Iterator it=hash_map.entrySet().iterator();	
	System.out.println("Traverse elemenets using iterator : ");
	
	while(it.hasNext()) {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		
		Map.Entry<Integer,String>ele=(Map.Entry)it.next();
		System.out.println(ele.getKey()+" , "+ele.getValue());
		
	}
	
	}
	

	/**
	 * map contains a mapping for the specified key. 
	 * 
	 */
	public static void containsKey() {
		
		if(hash_map.containsKey(3))
		   System.out.println( "Key ele exists");
		else
		   System.out.println("Key ele Not exist");
		System.out.println();

	}
	
	/**
	 * map contains a mapping for the specified value. 
	 * 
	 */
	public static void containsValue() {
		
		if(hash_map.containsValue("anu"))
		   System.out.println( "Key ele exists");
		else
		   System.out.println("Key ele Not exist");
		System.out.println();

	}
	
	/**
	 * count number of elements in HashMap using size()
	 * 
	 */
	public static void size() {
		System.out.println( "Size of HashMap : "+hash_map.size());
	}
	
	/*
	 * view of the mappings contained in a map. 
	 */
	public static void entrySet() {
		System.out.println("View of mappings contained in a map "+hash_map.entrySet() );

	}
	
	/*
	 *  map contains key-value mappings (empty) or not using isEmpty()
	 *  
	 */
	public static void isEmpty() {
		System.out.println("HashMap empty : "+hash_map.isEmpty() );

	}
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("Select option from menu ");
		Scanner sc1=new Scanner(System.in);
		int  chioce;
		
		do {
			System.out.println("Enter your chioce : ");
			System.out.println("1. put()");
			System.out.println("2. size()");
			System.out.println("3. iterator()");
			System.out.println("4. forEach()");
			System.out.println("5. traverseEmhancedFor()");
			System.out.println("6. remove()");
			System.out.println("7. containsKey()");
			System.out.println("8. containsValue()");
			System.out.println("9. isEmpty()");

			System.out.println("10. exit()");

			 chioce =sc1.nextInt();
			System.out.println();
			
			switch(chioce) {
				case 1:  
					put();
					break;
			
				case 2: 
					size();
					break;
				
				case 3: 
					
					iterator();					
					break;
					
				case 4:
					forEach();
					break;
					
				case 5:
					traverseEmhancedFor();
					break;
					
				case 6:
					containsValue();
					break;
					
				case 7:
					containsKey();
					break;
					
				case 8:
					entrySet();
					break;
					
					
				case 9:
					isEmpty();
					break;
					
				case 10:
					break;
					
				default : 
					System.out.println("Invallid selection, Try again");
				
					}
			
		}while(chioce!=10);
		
	}
}


