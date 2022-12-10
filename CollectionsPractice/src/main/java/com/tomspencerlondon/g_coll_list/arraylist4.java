package com.tomspencerlondon.g_coll_list;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	//Remove: add, contains, remove, clear, isEmpty() 
 */
public class arraylist4 {

	public static void main(String[] args) {
		// declare and build the array list 
		String[] movies = {"Bambi","Rambo","Schrek","Rocky","Scarface"}; 
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());  //same as arr.length
		for ( int i = 0 ; i < movies.length; i++) {
			al.add(movies[i]);
		}
		System.out.println(al.size() +" "+ al + " " + al.get(0) );
		
        // remove, clear, isEmpty
		Scanner scan = new Scanner (System.in);
		System.out.println("Which movie? ");
		String val = scan.nextLine();
		if (al.contains(val)) {
			al.remove(val);  // remove by value
			
		}
		al.remove(0); // remove by position
		System.out.println(al.size() +" "+ al); // prove the value is removed
		al.clear();
		System.out.println(al.size() +" "+ al);  // size is 0
		System.out.println(al.isEmpty());  // true
		
		
	}

}
