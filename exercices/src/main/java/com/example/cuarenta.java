package com.example;

import java.util.Scanner;

public class cuarenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] numeros = {5, 1, 8, 3, 2, 4, 6, 7, 9, 10};
        int buscado = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El número " + buscado + " se encuentra en el array.");
        } else {
            System.out.println("El número " + buscado + " no se encuentra en el array.");
        }
    }
}
