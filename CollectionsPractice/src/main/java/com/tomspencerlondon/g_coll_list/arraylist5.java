package com.tomspencerlondon.g_coll_list;

import java.util.ArrayList;
import java.util.Arrays;

/* 	//addAll()   */
public class arraylist5 {
	public static void main(String[] args) {
		String[] movies = {"Bambi","Rambo","Schrek","Rocky","Scarface"}; 
		// declare array list: no size required
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());  //same as arr.length
		
		//addall
		al.addAll(Arrays.asList(movies));
		System.out.println(al.size() +" "+ al); 
		
        // addall
		al.addAll(Arrays.asList("Cinderella","Peter Pan","Casino"));
		System.out.println(al.size() +" "+ al);
	}
}
