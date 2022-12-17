package com.tomspencerlondon.lambdasandstreams;

public class CarpetLambda {

  interface Carpet {
    double calcArea(double l, double w);
  }

  interface CalcPrice {
    double calc(double area);
  }

  interface CalcTotal {
    double calc(double cp, double lp);
  }

  public static void main(String[] args) {
    Carpet area = (l, w) -> l * w;
    CalcPrice lp = (sqm) -> 10 * sqm;
    CalcPrice cp = (sqm) -> 15 * sqm;
    CalcTotal totalPrice = Double::sum;

    double calcArea = area.calcArea(2.0, 4.0);
    double labourcost = lp.calc(calcArea);
    double carpetCost = cp.calc(calcArea);
    double total = totalPrice.calc(labourcost, carpetCost);

    System.out.println("Area: " + calcArea);
    System.out.println("Labour cost: " + labourcost);
    System.out.println("Carpet cost: " + carpetCost);

    System.out.println("Final cost: " + total);
  }
}
