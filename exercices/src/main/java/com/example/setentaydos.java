package com.example;

import java.util.Scanner;

public class setentaydos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter != ' ' && Character.isLetter(caracter)) {
                contador++;
            }
        
    }
        System.out.println("La cantidad de letras en la frase es: " + contador);

        scanner.close();
    }
}
