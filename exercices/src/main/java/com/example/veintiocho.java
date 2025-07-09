package com.example;

import java.util.Scanner;

public class veintiocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero:");
        int numero = scanner.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;

        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
    }
}
