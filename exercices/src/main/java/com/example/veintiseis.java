package com.example;
import java.util.Scanner;
public class veintiseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();

        if (num2 == 0){
            System.out.println("is not possible to divide by zero");
        } else if (num1 % num2 == 0) {
            System.out.println("The first number is divisible by the second number.");
        } else {
            System.out.println("The first number is not divisible by the second number.");
        }
    }
}
