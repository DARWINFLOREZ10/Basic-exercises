package com.example;

import java.util.Scanner;

public class veintinueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresa un número:");
        String numeroTexto = scanner.nextLine();

        if (numeroTexto.startsWith("-")){
            numeroTexto = numeroTexto.substring(1);
        }
        if(numeroTexto.length() == 3) {
            System.out.println("El número tiene exactamente 3 dígitos.");
        } else {
            System.out.println("El número no tiene exactamente 3 dígitos.");
        }
    }
}
