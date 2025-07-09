package com.example;

import java.util.Scanner;

public class diesiceis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase o palabra:");
        String texto = scanner.nextLine();

        int contadorvocales = 0;
        
        for (int i = 0; i < texto.length(); i++){
            char letra = Character.toLowerCase(texto.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorvocales++;
            }
        }
        System.out.println("El número de vocales en la frase es: " + contadorvocales);
    }
}
