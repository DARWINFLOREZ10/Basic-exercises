package com.example;
import java.util.Scanner;

public class veintidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) { // controla las filas
            for (int j = 1; j <= i; j++) { // imprime asteriscos por fila
                System.out.print("*");
            }
            System.out.println(); // salto de línea
        }
    }
}
