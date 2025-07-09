package com.example;
import java.util.Scanner;
public class veintitres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a prhase: ");
        String phrase = scanner.nextLine();


        int count = phrase.length();

        System.out.println("The number of characters in the phrase is: " + count + " characters.");

    }
}
