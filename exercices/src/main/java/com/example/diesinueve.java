package com.example;
import java.util.Scanner;
public class diesinueve {
    public static void main(String[] args) {
        
        System.out.print("Ingresa el número que quieres saber si es primo: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean esPrimo = true;
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
    }
}
