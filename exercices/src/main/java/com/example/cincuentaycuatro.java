package com.example;

import java.util.Scanner;

public class cincuentaycuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantos terminos fibonacci deseas ver? ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("los primeros " + n + " terminos de la serie Fibonacci son: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
        scanner.close();
    }
}
