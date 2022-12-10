package com.tomspencerlondon.g_coll_list;

import java.util.ArrayList;
import java.util.Scanner;
/* //: get() */
public class arraylist3 {

	public static void main(String[] args) {
		String[] movies = {"Bambi","Rambo","Schrek","Rocky","Scarface"}; 
		// declare array list: no size required
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.size());  //same as arr.length
		for ( int i = 0 ; i < movies.length; i++) {
			al.add(movies[i]);
		}
		System.out.println(al.size() +" "+ al);
		
        // get
		Scanner scan = new Scanner (System.in);
		System.out.println("Which movie? ");
		String val = scan.nextLine();
		
		for ( int i = 0 ; i < al.size(); i++) {
			if (val.equals(al.get(i))) {
				System.out.println(val);
			}
		} 
	
		
	}

}
