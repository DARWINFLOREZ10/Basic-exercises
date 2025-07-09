package com.example;

import java.util.Scanner;

public class cuarentaydos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingresa la letra a buscar: ");
        String letra = scanner.nextLine();

        if (letra.length() != 1) {
            System.out.println("Por favor, ingresa solo una letra.");
        } else {
            int contador = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra.charAt(0)) {
                    contador++;
                }
            }
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la palabra '" + palabra + "'.");
        }
    }
}
