package com.example;

import java.util.Scanner;

public class cuarentayseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String sinEspacios = frase.replace(" ", "");
        System.out.println("Frase sin espacios: " + sinEspacios);
    }
}
