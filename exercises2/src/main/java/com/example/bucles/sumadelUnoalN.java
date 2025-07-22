package com.example.bucles;

import java.util.Scanner;

public class sumadelUnoalN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();

       int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los números del 1 al " + n + " es: " + suma);
        
        scanner.close();
    }
}
