package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class cincuentaycinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingrese una segunda palabra: ");
        String segundaPalabra = scanner.nextLine();

        palabra = palabra.replaceAll("//s", "").toLowerCase();
        segundaPalabra = segundaPalabra.replaceAll("//s", "").toLowerCase();

        if (esAnagrama(palabra, segundaPalabra)) {
            System.out.println("Las palabras son anagramas.");
        } else {
            System.out.println("Las palabras no son anagramas.");
        }
    }
    public static boolean esAnagrama(String palabra, String segundaPalabra) {;
    if (palabra.length() != segundaPalabra.length()) {
        return false;
    }

    char[] arreglo1 = palabra.toCharArray();
    char[] arreglo2 = segundaPalabra.toCharArray();

    Arrays.sort(arreglo1);
    Arrays.sort(arreglo2);

    return Arrays.equals(arreglo1, arreglo2);
    }
}
