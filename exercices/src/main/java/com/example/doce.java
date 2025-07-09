package com.example;

import java.util.Scanner;

public class doce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número:");
        int número = scanner.nextInt();
        
        int suma = 0;

        while (número !=0){
            int digito = número % 10;
            suma += digito;
           número /= 10;
        }
       System.out.println("La suma de los dígitos es: " + suma);
        scanner.close();
    }
}
