package com.example;
public class setentaytres {
   public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false; // tiene divisor → no es primo
            }
        }
 
        return true;
        
    }

    public static void main(String[] args) {
        System.out.println("Números primos del 1 al 100:");

        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}