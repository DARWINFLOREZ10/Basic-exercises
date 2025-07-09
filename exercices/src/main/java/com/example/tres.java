package com.example;

import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
       System.out.println("hello, enter the number that you wnat to check");

         Scanner scanner = new Scanner(System.in);

         int number = scanner.nextInt();
         if (number >0){
            System.err.println("the number is positive");}
            else if (number<0){
                System.out.println("the number is negative");
            }
            else {
                System.out.println("the number is zero");
            }
            scanner.close();
    }
}
