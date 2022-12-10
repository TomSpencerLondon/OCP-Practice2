package com.tomspencerlondon.g_coll_list;
/*EXERCISE
 *Read words delimiter  ;   add every word  to the ArrayList
 *How many words do you have? size
 *does it contain bravely
 *IndexOf bravely
 *remove bravely
 *does it contain bravely
 *size
 *add Xanadu
 *indexOf Xanadu
 *add Xanadu at position 0
 *indexOf Xanadu
 *size
 */
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
	public static void main(String[] args) {
		// Add: add(Object), add(index, Object) and addAll() 
		// Retrieve: get(), 	
		// Size it: size()
		///.contains() .indexOf() .lastIndexOf()
		// Update: set
		// Remove: remove, clear
		// iterate with a for loop 
		// isEmpty()
		// Object[] toArray()

		//addAll() 
		
		//Retrieve: get(), .contains() .indexOf() .lastIndexOf()
		String[] array = {"bambi","rambo","casino","shrek"};
		String[] arr   = new String[4];
		System.out.println(Arrays.toString(array));
		System.out.println("---");
		ArrayList<String> arraylist = new ArrayList<String>(); // declare
		for (int i = 0 ; i < array.length ; i++ ) { 
			arraylist.add(array[i]); // add values
		};
		System.out.println(arraylist);
		arraylist.add("John"); // add avlues
		arraylist.add("Peter");  
		System.out.println("get(0)" + arraylist.get(0));  // get by position
		System.out.println("All values of array list ----");
		for (String val : arraylist) { // loop the arraylist
			System.out.println(val);
		}
//				
		System.out.println(arraylist.size());//SIZE 	array.length: 
		System.out.println(arraylist);//Add: 
////	
//		System.out.println(arraylist.get(0));
//		System.out.println(arraylist.get(5));
//		System.out.println(arraylist.get(4));
////		
//		boolean b = arraylist.contains("John");// returns trueif the list contains the specified element.
//		System.out.println("Boolean b: " + b);
//		System.out.println("Index of a: "+ arraylist.indexOf("John"));//: returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
//		arraylist.add("bambi");
//		System.out.println("Last index of a: "+  arraylist.lastIndexOf("bambi")); 
////
////		//Update: set
//		arraylist.set(1, "a");
//		
//			System.out.println(arraylist);
//			arraylist.remove(0) ;  //Remove: remove, clear
//			arraylist.remove("a");
//			System.out.println(arraylist);//Add: 
//			arraylist.clear();
//			System.out.println( "Empty? " + arraylist.isEmpty());
////		
////			System.out.println();
//			
////		//Add: 
////		//add(Object), add()index, Object) and addAll() 
//		  arraylist = new ArrayList<String>(
//					Arrays.asList("Pratap", "Peter", "Harsh") );
//
//		arraylist.addAll(Arrays.asList("Bambi", "Rambo", "Shrek"));
//		System.out.println("Elements are:"+ arraylist);
//		
//		String[] arraya = {"bambi","rambo","casino","shrek"};
//		arraylist.clear();
//		arraylist.addAll(Arrays.asList(arraya));
		
		
//		System.out.println("Elements are:"+ people1);
//
//		ArrayList <String> arraylist1=new ArrayList<String>();
//		arraylist1.add("apple");
//		arraylist1.add("Al1:E2");
//		arraylist1.add("Al1:E3");
//		
//		ArrayList <String> arraylist2=new ArrayList<String>();
//		arraylist2.add("apple");
//		arraylist2.add("Al2:E2");
//		arraylist2.add("Al2:E3");
//		
//		ArrayList<String> myArrayList=new 	ArrayList<String>();
//		myArrayList.addAll(arraylist1);
//		myArrayList.addAll(arraylist2);
//		people.addAll(Arrays.asList("q","w","e"));
//		
//		// iterate
//		Iterator<String> myIterator = myArrayList.iterator();
//		while(myIterator.hasNext()){
//			System.out.println(myIterator.next());
//		}
//
//		for(String temp:myArrayList){
//			 System.out.println(temp);
//		 }
//		
//	     Collections.sort(myArrayList);
//		 for(String temp:myArrayList){
//			 System.out.println(temp);
//		 }
//		 
//	     Collections.reverse(myArrayList);
//		 for(String temp:myArrayList){
//			 System.out.println(temp);
//		 }
//		 
//		 ArrayList<String> myArrayList3=new ArrayList<String>();
//		 for(String temp:arraylist1) {
//			 myArrayList3.add(arraylist2.contains(temp)?"Yes":"No");
//		 }
//		 System.out.println(myArrayList3);
	 
	 
}
}