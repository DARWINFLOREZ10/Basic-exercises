package com.example;

import java.util.Scanner;

public class sesentaysiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingresa la letra con la que deben comenzar las palabras: ");
        char letra = scanner.next().toLowerCase().charAt(0); 

        String[] palabras = frase.split(" ");
        int contador = 0;

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                if (Character.toLowerCase(palabra.charAt(0)) == letra) {
                    contador++;
                }
            }
        }

        System.out.println("Número de palabras que comienzan con '" + letra + "': " + contador);
    }
}
