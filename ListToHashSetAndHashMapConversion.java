package com.cashapona.collections.may19;

import java.util.*;


public class ListToHashSetAndHashMapConversion {

	
		public static void main(String[] args) 
		{
			
			//creates empty ArrayList
			
			ArrayList<Integer> alist=new ArrayList<Integer>();   
			alist.add(10);
			alist.add(1);
			alist.add(20);
			alist.add(20);

			System.out.println("----------------ArrayList------------- ");
			System.out.println(alist);

			//creates HashSet from ArrayList objects
			
			System.out.println();
			HashSet <Integer>hs=new HashSet<Integer>(alist);
			System.out.println("After Accesing eles from ArrayList to HashSet  ");

			System.out.println("------Store ArrayList objects into HashSet---------- ");
			System.out.println(hs);
			
			//add(), add ele in a hashset
			
			System.out.println();
			System.out.println("Before adding HashSet element  : "+hs);
			hs.add(12);
			System.out.println("AFter adding HashSet element  : "+hs);

			//ArrayList to HashMap conversion
			System.out.println();

			System.out.println("------Store ArrayList objects into HashMap ------ ");
			HashMap <Integer,ArrayList<Integer> >hmap=new HashMap<Integer,ArrayList<Integer> >();
			hmap.put(1, alist);
			hmap.put(2, alist);
			System.out.println("After adding ArrayList Objects into HashMap : ");
			System.out.println(hmap);
			
			}


}

	


