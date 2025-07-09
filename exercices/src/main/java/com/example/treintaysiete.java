package com.example;

import java.util.Scanner;

public class treintaysiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;

        for ( int i = 1; i <= 5; i++){
            System.out.print("Ingresa el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }
        double promedio = suma / 5;
        System.out.println("El promedio de los 5 numeros es " + promedio);
    }
}
