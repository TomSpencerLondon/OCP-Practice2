package com.tomspencerlondon.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice {

  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();

    map.put(200, "OK");
    map.put(303, "See Other");
    map.put(404, "Not found");
    map.put(500, "Internal Server Error");
    map.put(501, "Internal Server Error");

    System.out.println("Map entries");

    for (Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }

    System.out.println();

    System.out.println(map.get(404));
  }

}
