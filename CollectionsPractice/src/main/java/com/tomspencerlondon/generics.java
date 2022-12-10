package com.tomspencerlondon;

public class generics {

	public static <E> void printArrayAllDataTypes (E[] inputArray) {
		System.out.println("Generics");
		
		    System.out.println(inputArray[0].getClass() + "\t");
		
		    for(E element:inputArray){
				System.out.print(element + ", ") ;
			}
			System.out.println();
			
			for ( int i = 0; i < inputArray.length; i++){
				System.out.print(i + ": " + inputArray[i]+ ", ") ;
			}
			System.out.println();
			
	}
	
	
	public static void printArrays ( Integer[] a ) {
		for ( int i = 0; i < a.length; i++){
			System.out.print(i + ": " + a[i]+ ", ") ;
		}
		System.out.println();
	}
	
	public static void printArrays ( Character[] a) {
		for ( int i = 0; i<a.length; i++){
			System.out.print(i + ": " + a[i]+ ", ") ;
		}
		System.out.println();
	}
	
	public static void printArrays ( Double[] a) {
		for ( int i = 0; i<a.length; i++){
			System.out.print(i + ": " + a[i]+ ", ") ;
		}
		System.out.println();
	}
	public static void printArrays ( String[] a) {
		for ( int i = 0; i<a.length; i++){
			System.out.print(i + ": " + a[i]+ ", ") ;
		}
		System.out.println();
	}
	
	public static void main (String args[]){	
	   Integer[] intArray	= {1,2,3,4,5};  // int vs Integer
	   Double[] doubleArray	= {1.1, 2.2, 3.3, 4.4};
	   Character[] charArray= {'a','b','C'};
	   
	   char [] charA 	    = {'a','b','C'};   // char vs String
	   String[] stringArray	= {"cat","bat","pat"};
	      
	   System.out.println ("integer array");
	   printArrays(intArray);
////	   
	   System.out.println ("double array");
	   printArrays(doubleArray);
//////	   
 	   System.out.println ("chars array");
	   printArrays(charArray);
	   
	   System.out.println("----");
	   printArrayAllDataTypes(intArray);
	   System.out.println("----");
	   printArrayAllDataTypes(doubleArray);
	   System.out.println("----");
	   printArrayAllDataTypes(charArray);
	   System.out.println("----");
	   printArrayAllDataTypes(stringArray);
	  
}
}
