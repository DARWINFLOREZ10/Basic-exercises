package com.example;

import java.util.Scanner;

public class veinticico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String[] words = phrase.split(" ");
        int wordCount = words.length;
        System.out.println("The number of words in the phrase is: " + wordCount + " words.");
    }
    }

