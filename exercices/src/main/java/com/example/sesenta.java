package com.example;

import java.util.Scanner;

public class sesenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nNúmeros multiplos de 3:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.println(numeros[i]);
            }
        }
        
}
}
