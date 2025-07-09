package com.example;

import java.util.Scanner;

public class sesentaynueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
       
int potencia=1;
boolean esPotencia= false;

while ( potencia < numero) {
            potencia *= 2;
            if (potencia == numero) {
                esPotencia = true;
                break;
            }
            potencia *= 2;
        }

        if (esPotencia) {
            System.out.println("El número " + numero + " es una potencia de 2.");
        } else {
            System.out.println("El número " + numero + " no es una potencia de 2.");
        }
    }
}
