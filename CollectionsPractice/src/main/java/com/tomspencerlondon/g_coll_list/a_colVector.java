package com.tomspencerlondon.g_coll_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class a_colVector {

	public static void main(String[] args) {
		//Difference between ArrayList and Vector
		//ArrayList and Vector both implements List interface and maintains insertion order.
		//But there are many differences between ArrayList and Vector classes that are given below.
		System.out.println();		
		System.out.println("Vectors");	  	
		String [] movies = {"Bambi", "Endgame","Shrek","Rambo","Rocky"};
			   Vector<String> v=new Vector<String>();//creating vector  
			   v.add("umesh");//method of Collection  
			   v.addElement("irfan");//method of Vector  
			   v.addElement("kumar");  
			   
			   Vector<String> v2=new Vector<String>();//creating vector  
				v2.addAll(v);
				v2.addAll(Arrays.asList("Casino","Scarface","Cinderella"));
				Collections.addAll(v2,movies);
				
				System.out.println(v2.toString());
				
			   //traversing elements using Enumeration  
//			   Enumeration<String> e = v.elements();  
//			   while(e.hasMoreElements()){  
//			    	System.out.println(e.nextElement());  
//			   }  
			   	
			   // Retrieve and set
//			  System.out.println("get " + v.get(2));  
//			  v.set(2,"Blue");  
//			  System.out.println("get " + v.get(2));  
//				boolean b = v.contains("a");// returns trueif the list contains the specified element.
//				int i = v.indexOf("Blue");//: returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
//				int j = v.lastIndexOf("Blue");
//				System.out.println("b i j  " + b + " " + i + " " + j); 
//				
//				// remove and clear
//			  System.out.println("size " + v.size());  
//			  System.out.println("remove " + v.remove(2)); 
//			  System.out.println("remove " + v.remove("Blue")); 
//			  
//			  System.out.println("size " + v.size());
//			  
//			  System.out.println("remove " + v.remove("kumar"));
//			  System.out.println("size " + v.size());
//			  
//			  v.clear();
//			  System.out.println("size " + v.size());
//			  System.out.println( "Empty? " + v.isEmpty());
			  



	}

}
