package com.example;

import java.util.Scanner;

public class sesentaytres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[][] matriz = new int[3][3];

        // Leer la matriz
        System.out.println("Ingresa los valores de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular y mostrar el promedio de cada fila
        System.out.println("\nPromedios por fila:");
        for (int i = 0; i < 3; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
            double promedio = (double) suma / 3;
            System.out.println("Fila " + (i + 1) + ": " + promedio);
        }

    }
}
