package com.tomspencerlondon;

public class Library {

  private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String SPECIAL_CHARACTERS = "!@£$%^&*~()#";
  private static final String DIGITS = "123456789";

  //  plan: Build a password validator - see if the password meets the criteria
//  String variable - put password
//  String needs:
//    - 8 or more characters
//    - one lower case letter
//    - one upper case letter
//    - one special character
//    - one digit
//  algorithm =
//  4 booleans
//  all 4 must be true for the password to be valid
  public boolean hasEightCharacters(String password) {
    return password.length() >= 8;
  }

  public boolean hasOneLowerCaseLetter(String password) {
    String lowerCase = LETTERS.toLowerCase();
    for(int i = 0; i < password.length(); i++) {
      String nextLetter = Character.toString(password.charAt(i));
      if (lowerCase.contains(nextLetter)) {
        return true;
      }
    }
    return false;
  }

  public boolean hasOneUpperCaseLetter(String password) {
    for (int i = 0; i < password.length(); i++) {
      String nextLetter = Character.toString(password.charAt(i));
      if (LETTERS.contains(nextLetter)) {
        return true;
      }
    }

    return false;
  }
  public boolean hasOneSpecialCharacter(String password) {
    for (int i = 0; i < password.length(); i++) {
      String nextLetter = Character.toString(password.charAt(i));
      if (SPECIAL_CHARACTERS.contains(nextLetter)) {
        return true;
      }
    }
    return false;
  }

  public boolean hasOnedigit(String password) {
    for (int i = 0; i < password.length(); i++) {
      String nextLetter = Character.toString(password.charAt(i));
      if (DIGITS.contains(nextLetter)) {
        return true;
      }
    }
    return false;
  }

  public void reportOnInvalid(boolean hasEightCharacters, boolean hasOneLowerCaseLetter, boolean hasOneUpperCaseLetter, boolean hasOneSpecialCharacter, boolean hasOneDigit) {
    if (!hasEightCharacters) {
      System.out.println("Does not have 8 characters");
    }

    if (!hasOneLowerCaseLetter) {
      System.out.println("Does not have a lowercase letter");
    }

    if (!hasOneUpperCaseLetter) {
      System.out.println("Does not have an uppercase letter");
    }

    if (!hasOneSpecialCharacter) {
      System.out.println("Does not have a special character");
    }

    if (!hasOneDigit) {
      System.out.println("Does not have a digit");
    }
  }
}
