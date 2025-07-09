package com.example;

import java.util.Scanner;

public class treintaiuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.print("ingresa el tercer numero: "); 
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer numero es el mayor: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo numero es el mayor: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El tercer numero es el mayor: " + numero3);
        } else {
            System.out.println("Hay dos o más números que son iguales y son los mayores.");
        }
        scanner.close();
    }
}
