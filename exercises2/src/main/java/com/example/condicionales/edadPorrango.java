package com.example.condicionales;

import java.util.Scanner;

public class edadPorrango {
    public static void main(String[] args) {
       // int edad = 25; // Puedes cambiar este valor para probar diferentes rangos
Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 0) {
            System.out.println("Edad no válida.");
        } else if (edad < 13) {
            System.out.println("Eres un niño.");
        } else if (edad < 20) {
            System.out.println("Eres un adolescente.");
        } else if (edad < 65) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
    }
}
