package com.example;

import java.util.Scanner;

public class setentaycuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        boolean soloVocales = true;
        
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                soloVocales = false;
                break;
            }
        }
        if (soloVocales) {
            System.out.println("La palabra contiene solo vocales.");
        } else {
            System.out.println("La palabra contiene consonantes.");
        }
    }
}
