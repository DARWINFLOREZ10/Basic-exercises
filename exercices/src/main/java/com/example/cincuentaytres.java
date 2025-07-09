package com.example;

import java.util.Scanner;

public class cincuentaytres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("palabra invertida: ");
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
        System.out.println();
    }
}
