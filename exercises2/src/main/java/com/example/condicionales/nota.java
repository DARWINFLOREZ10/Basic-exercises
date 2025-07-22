package com.example.condicionales;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 5.0) {
            System.out.println("Aprobado");
        } else if (nota >= 3.0) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
    }
}
