package com.example;

import java.util.Scanner;

public class sesentaydos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] a = new int[2][2];
        int [][] b = new int[2][2];
        int [][] c = new int[2][2];

        System.out.println("Ingrese los elementos de la primera matriz (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ingrese los elementos de la segunda matriz (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                b[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nResultado de a x b:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
            }
            System.out.println();
        }
    }
}
