package com.example;

import java.util.Scanner;

public class cincuentayocho {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;           
            invertido = invertido * 10 + digito; 
            numero = numero / 10;               
        }

        if (original == invertido) {
            System.out.println("El número es palíndromo.");
        } else {
            System.out.println("El número no es palíndromo.");
        }
    }
}
