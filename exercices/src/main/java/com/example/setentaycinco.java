package com.example;

import java.util.Scanner;

public class setentaycinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String resultado = "";

        for (int i =0; i < frase.length(); i++) {
            char c= frase.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                resultado += c;
            }
        }
     System.out.println("Frase sin vocales:" + resultado);
    }
}
