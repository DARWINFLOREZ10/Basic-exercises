package com.example;

import java.util.Scanner;

public class treintayocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número decimal:");
        int numero = scanner.nextInt();

        String binario = " ";
        int original = numero;

        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                int residuo = numero % 2;
                binario = residuo + binario;
                numero = numero / 2;
            }
        }

System.out.print("El numero binario de " + original + " es: " + binario);
        scanner.close();
    }
}
