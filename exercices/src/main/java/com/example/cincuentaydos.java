package com.example;

import java.util.Map;
import java.util.Scanner;

public class cincuentaydos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int [10];
        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        Map<Integer, Integer> frecuencias = new java.util.HashMap<>();

        for (int numero : numeros) {
            frecuencias.put(numero, frecuencias.getOrDefault(numero, 0) + 1);
        }

        int numeroMasRepetido = numeros[0];
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                numeroMasRepetido = entry.getKey();
            }
        }
        System.out.println("El numero mas repetido es: " + numeroMasRepetido);
    }
}
