package com.example;

import java.util.Scanner;

public class cincuenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        int suma = 0;

        System.out.print("Ingresa los 9 números para llenar la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
            }
        }
        double promedio = (double) suma / 9;
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
    }
}
