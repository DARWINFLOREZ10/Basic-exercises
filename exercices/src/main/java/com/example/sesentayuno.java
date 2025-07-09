package com.example;

import java.util.Scanner;

public class sesentayuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arreglo = new int[5];

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Ingrese 5 números que quieras positivos o negativos:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }
for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                positivos++;
            } else if (arreglo[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        scanner.close();
    }
}
