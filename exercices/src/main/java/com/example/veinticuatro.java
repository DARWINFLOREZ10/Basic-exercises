package com.example;

import java.util.Scanner;

public class veinticuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius *1.8 + 32;

        System.out.println("°c equivale a " + fahrenheit + "°F");
        scanner.close();
    }
}
