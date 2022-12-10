package com.tomspencerlondon.g_coll_list;
/*//Retrieve: .size() .contains() .indexOf() .lastIndexOf() */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist2 {

	public static void main(String[] args) {
		String[] movies = {"Bambi","Rambo","Schrek","Bambi","Rocky","Scarface","Bambi"}; 
		// declare array list: no size required
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.size());  //same as arr.length
		int i = 0;
		// add the values to arrayList al
		for ( i = 0 ; i < movies.length; i++) {
			al.add(movies[i]);
		}

		i     = al.indexOf("Bambi") ;
		int j = al.lastIndexOf("Bambi");
		
		System.out.println("Array list size "+al.size() +"  "+ al+ " Position of Bambi " +i +" and "+j);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Which movie? ");
		String val = scan.nextLine();
		// index
		System.out.println("Without contains Found at position " +al.indexOf(val));
		//
		if (al.contains(val)) {
		    i = al.indexOf(val) ;
			j = al.lastIndexOf(val);
			System.out.println("Found at position " +i + " and " +j);
		} else {
			System.out.println("Not Found " );
		}
		
		System.out.println("Sort");
		System.out.println(al);
		
		al.sort(null);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder()); 
		System.out.println(al);
		
	}

}
