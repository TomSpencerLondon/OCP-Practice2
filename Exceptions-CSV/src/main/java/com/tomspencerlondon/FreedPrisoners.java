package com.tomspencerlondon;

public class FreedPrisoners {

  public static void main(String[] args) {
    // Create a prison with 5 cells
    int[] prison = {1, 0, 1, 1, 0};

    // Initialize a counter for the number of freed prisoners
    int freedPrisoners = 0;

    // Loop through the cells in the prison
    for (int i = 0; i < prison.length; i++) {
      // If the current cell is unlocked and the cell before it is locked or this is the first cell, increment the freed prisoners counter
      if (prison[i] == 1 && (i == 0 || prison[i - 1] == 0)) {
        freedPrisoners++;
      }
    }

    // Print the number of freed prisoners
    System.out.println("Number of freed prisoners: " + freedPrisoners);
  }
}
