package com.example;

import java.util.Scanner;

public class treintaycinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        StringBuilder palabraInvertida = new StringBuilder(palabra);
        palabraInvertida.reverse();
        System.out.println("La palabra invertida es: " + palabraInvertida.toString());
    }
}
