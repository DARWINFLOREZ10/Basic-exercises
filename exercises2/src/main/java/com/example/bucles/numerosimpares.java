package com.example.bucles;

public class numerosimpares {
    public static void main(String[] args) {
        int numero = 1; // Comenzamos desde el primer número impar

        System.out.println("Los primeros 10 números impares son:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numero);
            numero += 2; 
        }
    }
}
