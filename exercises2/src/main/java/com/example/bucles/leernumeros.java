package com.example.bucles;

import java.util.Scanner;

public class leernumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
            System.out.print("Ingrese otro número (0 para salir): ");
            numero = scanner.nextInt();
        }
    }
}
