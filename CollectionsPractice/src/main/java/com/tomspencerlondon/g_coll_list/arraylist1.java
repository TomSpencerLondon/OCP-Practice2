package com.tomspencerlondon.g_coll_list;
/* * 	//Add: add(Object), add(index, Object) and addAll() 
		//Size it: size()
		//Retrieve: get(), .contains() .indexOf() .lastIndexOf()
		//Update: set
		//Remove: remove, clear, removeRange(int fromIndex, int toIndex), //isEmpty()
		//iterate  
		// Object[] toArray()  */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// add
public class arraylist1 {

	public static void main(String[] args) {
		
		// declare array
		String[] arr  = new String[4];
		String[] arr2 = {"sd","sfddsfs","sdfs"};
		
		for ( String s : arr) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(arr2));
		
		// declare array list: no size required
		ArrayList<String> al = new ArrayList<String>();
		
		//check the size
		System.out.println("arr length: "+ arr.length);  //same as arr.length
		System.out.println("arr1 length: "+ arr2.length);  //same as arr.length
		
		System.out.println("al size: "+ al.size());  //same as arr.length
		al.add("peter");
		System.out.println("al size: "+ al.size());  //same as arr.length
				
	}

}
