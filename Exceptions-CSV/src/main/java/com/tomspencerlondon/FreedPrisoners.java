package com.tomspencerlondon;

public class FreedPrisoners {

  public static void main(String[] args) {
    // Create a prison with 5 cells
    int[] prison = {1, 1, 0, 0, 0, 1, 0};
//    Freed = 2
//    1 0 1 1 0
//    0 1 0 0 1
//    1 0 1 1 0

    // Initialize a counter for the number of freed prisoners
    int freedPrisoners = 0;

    // Loop through the cells in the prison
    for (int i = 0; i < prison.length; i++) {
      // If the current cell is unlocked and the cell before it is locked or this is the first cell, increment the freed prisoners counter
      if (prison[i] == 1) {
        freedPrisoners++;
        switchPrisonCells(prison);
      }
    }

    // Print the number of freed prisoners
    System.out.println("Number of freed prisoners: " + freedPrisoners);
  }

  private static void switchPrisonCells(int[] prison) {
    for (int i = 0; i < prison.length; i++) {
      prison[i] = prison[i] == 0 ? 1 : 0;
    }
  }
}
