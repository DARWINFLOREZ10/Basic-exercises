package com.example;

import java.util.Scanner;

public class setentayuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero:");
        int numero = scanner.nextInt();

        int suma = 0;
        int originalNumero = numero;

        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos del número " + originalNumero + " es: " + suma);

        scanner.close();    


    }
}
