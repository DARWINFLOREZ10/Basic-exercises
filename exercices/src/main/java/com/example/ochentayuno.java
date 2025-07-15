package com.example;

import java.util.Scanner;

public class ochentayuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero:");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();

        int menor= num1;
        int mayor= num2;

        if (num1 > num2){
            menor = num2;
            mayor = num1;
        }
        System.out.println("numeros entre " + menor + " y " + mayor + ":");
        for (int i = menor + 1; i < mayor; i++) {
            System.out.print(i + " ");
        }
    }
}
