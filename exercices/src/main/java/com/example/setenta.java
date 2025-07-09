package com.example;

import java.util.Scanner;

public class setenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a phrases: ");
        String phrase = scanner.nextLine();

        String[] words = phrase.split(" ");
        String result = "";

        for (String word : words){
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                result += firstLetter + restOfWord + " ";
            }
        }
        System.out.println("Phrase with stiyle:");
        System.out.println(result.trim());
        scanner.close();
    }
}
