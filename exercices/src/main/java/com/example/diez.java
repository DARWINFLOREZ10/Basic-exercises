package com.example;
import java.util.Scanner;

public class diez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        int resultado = 1;

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                resultado = resultado * i;
            }
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }

        scanner.close();
    }
}


