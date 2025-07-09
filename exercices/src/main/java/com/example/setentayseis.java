package com.example;

import java.util.Scanner;

public class setentayseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero X: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese cuantos multiplos(N) quieres ver: ");
        int n = scanner.nextInt();

        System.out.println("Los " + n + " primeros multiplos de " + x + " son:");

        for (int i = 1; i <= n; i++) {
            int multiplo = x * i;
            System.out.println(multiplo);
        }
    }
}
