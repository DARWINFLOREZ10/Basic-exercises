package com.example;

import java.util.Scanner;

public class treinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        System.out.print("Ingresa otro número: ");
        int otroNumero = scanner.nextInt();

        int menor = Math.min(numero, otroNumero);
        int mayor = Math.max(numero, otroNumero);

        System.out.println("Números impares entre" + menor + " y " + mayor + ":");

        for ( int i = menor; i <= mayor; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
