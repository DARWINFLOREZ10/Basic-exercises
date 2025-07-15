package com.example;
import java.util.Scanner;

public class ochentaycuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        System.out.print("Caracteres únicos: ");
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int contador = 0;

            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(j) == letra) {
                    contador++;
                }
            }

            if (contador == 1) {
                System.out.print(letra + " ");
            }
        }
    }
}
