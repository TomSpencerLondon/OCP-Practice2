package com.tomspencerlondon.g_coll_list;
/*
create a method:
name: buildArray, 
input parameter:  a String variable 
Return string array, 
what to do:
create blank array with same length as myword
Loop the word  ( 0 to myWord.length() )
and get every everyletter ( .charAt(i) )
put into every position on the blank array, the character of the word
e.g. myWord = "cat"
then myArray = {"c","a","t"}

name : createArray
input para: String myWord
return: String myDashArray
what to do: 
create an blank array by the length of the length on myWord
loop this array an replace every blank value with "-"

create a function:
name: printArray
input parameter: any string array
what to do:
Loop the array and print the elements in one line
print one blank line
*/

//create a function:
//name: playGame
//input: myWord, myArray, myDashArray
//return: boolean winOrLose
//to do:
//initialize winOrLose to true
//while the 2 arrays are not the same and the count is less than 15
// ask the end user for a letter
// is the letter in myArray?
// if so, replace the corresp

import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Arrays;
public class ex_hm {
	
public static Scanner myStringScanner = new Scanner(System.in);
 
public static ArrayList<String> buildArray (String myword) {
	  ArrayList<String> myword1 = new ArrayList<String>();
	  int  i=0;
	  for(i=0; i< myword.length() ; i++) {
			   String a = String.valueOf(myword.charAt(i)); //Convert char to string
			   myword1.add(a);
	  }
	  return myword1;
 }
 
 public static ArrayList<String> buildDashArray (String myword) {
	  ArrayList<String> myDash= new ArrayList<String>();
	  for( int i=0; i< myword.length() ; i++) {
	   myDash.add("-");
	  }
	  return myDash;
 }
 
 public static void printArray (ArrayList<String> myList) {
			  for (String s : myList) {
				  	System.out.print(s);
			  }
			  System.out.println();
 }

 public static boolean playGame(String myWord ,ArrayList<String> myArray,ArrayList<String> myDashArray) {
		boolean winOrLose = true;
		 int i = 0;
		 String letter  = "";
		 int count = 0;	 
		 while ( !(myArray.equals(myDashArray)) && count <6 ) {
			  System.out.println("Please Enter a letter "); 
			  letter = myStringScanner.nextLine();
			  for(i=0; i< myArray.size() ; i++) {
				  if (letter.equals(myArray.get(i))){
					  myDashArray.set( i,letter);
				  }
			  }
			  printArray (myDashArray);
			  count++;
		 }
		 if (!(myArray.equals(myDashArray))) {
		  winOrLose = false;
		 }
		return  winOrLose;
	}
 
 public static void main(String[] args) {

	 System.out.println("Please Enter a Word "); 
	 String myword  = myStringScanner.nextLine();
	 
	 boolean winOrLose;
	 ArrayList<String> myDash= new ArrayList<String>();
	 ArrayList<String> myList = new ArrayList<String>();
	 myList = buildArray(myword);
	 myDash = buildDashArray(myword); 
	 
	 printArray (myDash);
	 winOrLose = playGame (myword,myList,myDash);
	 if(winOrLose) 
	 	  { System.out.println("you won");}
	 else {
		 System.out.println("you lose");
		 printArray (myList);
	  }

	 
	 }

	}


