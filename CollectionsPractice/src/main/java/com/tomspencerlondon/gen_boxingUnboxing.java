/*
 * Autoboxing and Unboxing:              
 */
package com.tomspencerlondon;

public class gen_boxingUnboxing {
//	Autoboxing and Unboxing:
//		The automatic conversion of primitive data types into its equivalent
//      Wrapper type is known as boxing and opposite operation 
//  	is known as unboxing. 
//		So java programmer doesn't need to write the conversion code.
//		Advantage of Autoboxing and Unboxing:
//		No need of conversion between primitives and Wrappers manually so less coding is required.
	
	public static void main(String[] args) {
		 int a = 50;  
		 Integer a2 = new Integer(a);// boxing the 50 into an Integer  
		 Integer a3 = 5;  //Boxing  the 5 into an Integer
		 System.out.println(a2+" "+a3);  
		 
		//The automatic conversion of wrapper class type 
		//into corresponding primitive type, is known as Unboxing. 
		 Integer i = new Integer(50);  // boxing the 50 into an Integer
		 int b = i;  //unboxing the 50 into an int
		 System.out.println(b);  
		
		//Autoboxing can be performed with comparison operators. 
		  Integer j = new Integer(50);  // boxing the 50 into an Integer
		  if(j<100){            //unboxing internally  
			  System.out.println(j);  
		   }  
	}

}
