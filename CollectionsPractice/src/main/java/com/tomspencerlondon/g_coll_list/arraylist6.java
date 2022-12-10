package com.tomspencerlondon.g_coll_list;

import java.util.ArrayList;
import java.util.Scanner;

/* //: set(), 
 * returns values in insertion order, add to the end and retrieves from the beginning
 */
public class arraylist6 {

	public static void main(String[] args) {
		String[] movies = {"Bambi","Rambo","Schrek","Rocky","Scarface"}; 
		movies[0] ="Peter Pan";
		// declare array list: no size required
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());  //same as arr.length
		for ( int i = 0 ; i < movies.length; i++ ) {
			al.add(movies[i]);
		}
		System.out.println(al.size() +" "+ al);
		
        // get
		Scanner scan = new Scanner (System.in);
		System.out.println("Which movie? ");
		String val = scan.nextLine();
			if (! al.contains(val)) {
				al.set(0,val);
			}
			System.out.println(al.size() +" "+ al);
			
		}  
	}

