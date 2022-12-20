package com.tomspencerlondon.lambdasandstreams;

import java.util.ArrayList;
import java.util.List;

public class MatchPractice {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("cat");
    list.add("catwoman");
    list.add("catty");
    list.add("cats");
    list.add("cats");
    list.add("catburglar");
    System.out.println(list);

    String value = "cat";
    boolean isValid = list.stream().anyMatch(element -> element.contains(value)); //
    boolean isValidOne = list.stream().allMatch(element -> element.contains(value)); //
    boolean isValidTwo = list.stream().noneMatch(element -> element.contains(value)); //
    System.out.println("anyMatch " +value+ ": " +isValid
        + "\n allMatch "+value+ ": " +isValidOne
        + "\n noneMatch"+value+ ": " +isValidTwo);

    isValid = list.stream().noneMatch(element -> element.contains("y")); //
    System.out.println(" is nowhere noneMatch? " + isValid);

    isValid = list.stream().allMatch(element -> element.contains("c")); // false
    System.out.println("c is everywhere?(allMatch) " + isValid);


  }

}
