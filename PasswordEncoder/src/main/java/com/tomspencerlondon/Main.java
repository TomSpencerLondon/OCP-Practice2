package com.tomspencerlondon;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();
    String password = "Passwo*";
    boolean hasEightCharacters = false;
    boolean hasOneLowerCaseLetter = false;
    boolean hasOneUpperCaseLetter = false;
    boolean hasOneSpecialCharacter = false;
    boolean hasOneDigit = false;

    hasEightCharacters = library.hasEightCharacters(password);
    hasOneLowerCaseLetter = library.hasOneLowerCaseLetter(password);
    hasOneUpperCaseLetter = library.hasOneUpperCaseLetter(password);
    hasOneSpecialCharacter = library.hasOneSpecialCharacter(password);
    hasOneDigit = library.hasOnedigit(password);

    if (hasEightCharacters &&
        hasOneLowerCaseLetter &&
        hasOneUpperCaseLetter &&
        hasOneSpecialCharacter &&
        hasOneDigit) {
      System.out.println("Valid Password");
    } else {
      library.reportOnInvalid(hasEightCharacters, hasOneLowerCaseLetter, hasOneUpperCaseLetter, hasOneSpecialCharacter, hasOneDigit);
    }
  }
}