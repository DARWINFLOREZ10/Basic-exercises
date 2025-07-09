package com.example;

import java.util.Scanner;

public class nueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            switch (numero) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
            }
        } else {
            System.out.println("Número no válido. Debe ser entre 1 y 7.");
        }

        scanner.close();
    }
}
