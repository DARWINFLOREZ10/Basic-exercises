package com.example;
import java.util.Scanner;
public class siete {
    public static void main(String[] args) {
        System.out.println("Ingresa tu edad:");
        Scanner scanner = new Scanner(System.in);

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");  
        }
        else {
         System.out.println("Eres menor de edad.");
        }
        scanner.close();
    }
}
