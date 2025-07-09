package com.example;

import java.util.Scanner;

public class cincuentayuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un numero: ");
        int numero = scanner.nextInt();
        System.out.print("ingresa un segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Antes del intercambio: a = " + numero + ", b = " + numero2);

        int auxiliar = numero;
        numero = numero2;
        numero2 = auxiliar;

        System.out.println("Despues del intercambio: a = " + numero + ", b = " + numero2);

    }
}
