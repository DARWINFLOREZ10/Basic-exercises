package com.example;
import java.util.Scanner;

public class cincuentaysiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] resultado = new int[3][3];

        // Leer la primera matriz
        System.out.println("Ingresa los valores de la primera matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Leer la segunda matriz
        System.out.println("\nIngresa los valores de la segunda matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Sumar las dos matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar resultado
        System.out.println("\nResultado de la suma de las dos matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println(); // salto de línea por fila
        }
    }
}
