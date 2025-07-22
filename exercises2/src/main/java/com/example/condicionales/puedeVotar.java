package com.example.condicionales;

import java.util.Scanner;

public class puedeVotar {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted puede votar.");
        } else {
            System.out.println("Usted no puede votar.");
        }   

        scanner.close();
    }
}
