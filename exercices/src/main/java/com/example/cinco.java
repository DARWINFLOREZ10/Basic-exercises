package com.example;
import java.util.Scanner;


public class cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un número N:");

        int N = scanner.nextInt();

        int suma = 0; 

        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al " + N + " es: " + suma);
        scanner.close();
    }
}
