package com.example;

import java.util.Scanner;

public class setentaynueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        System.out.println("Ingrese los valores de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Que columna desea imprimir (0, 1 o 2): ");
        int columna = scanner.nextInt();

        if (columna < 0 || columna > 2) {
            System.out.println("Columna no válida. Debe ser 0, 1 o 2.");
            return;
        } 
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][columna];
        }
        System.out.println("La suma de la columna " + columna + " es: " + suma);
        scanner.close();
    }}

