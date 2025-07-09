package com.example;

import java.util.Scanner;

public class sesentaycuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una oración:");
        String oracion = scanner.nextLine();
        String[] palabras = oracion.split(" ");

        String palabraMasLarga = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }
        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}
