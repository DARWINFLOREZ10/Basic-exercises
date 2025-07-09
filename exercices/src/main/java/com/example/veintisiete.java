package com.example;

import java.util.Scanner;
 
public class veintisiete {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter a letter: ");

    String letter = scanner.nextLine().toLowerCase();
    switch (letter) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
        System.out.println("The letter is a vowel.");
        break;
      default:
        System.out.println("The letter is a consonant.");
        break;
    }
  }
}
