package com.example;

import java.util.Scanner;

public class setentayocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();String fraseSinEspacios = frase.replace(" ", "");
        int longitud = fraseSinEspacios.length();
        System.out.println("La longitud de la frase sin espacios es: " + longitud);
    }
}
