package com.example;
import java.util.Scanner;
public class once {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número N:");
        int N = scanner.nextInt();

        int par = 0;
        int impar = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Cantidad de números pares entre 1 y " + N + ": " + par);
        System.out.println("Cantidad de números impares entre 1 y " + N + ": " + impar);
        scanner.close();
    }
}
