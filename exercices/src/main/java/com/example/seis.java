package com.example;
import java.util.Scanner;
public class seis {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("que numero quieres saber su tabla de multiplicar:");
        int numero = scanner.nextInt();
        System.out.println("La tabla de multiplicar del " + numero + " es:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            scanner.close();
        }
    }   
}

