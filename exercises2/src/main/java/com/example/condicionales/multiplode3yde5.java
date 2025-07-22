package com.example.condicionales;

public class multiplode3yde5 {
   public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " es múltiplo de 3 y de 5");
            } else if (i % 3 == 0) {
                System.out.print(i + " es múltiplo de 3");
            } else if (i % 5 == 0) {
                System.out.print(i + " es múltiplo de 5");
            }
        }   
   } 
}
