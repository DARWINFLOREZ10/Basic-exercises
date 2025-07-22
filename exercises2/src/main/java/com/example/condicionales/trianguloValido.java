package com.example.condicionales;

public class trianguloValido {
    public static void main(String[] args) {
        int lado1 = 3;
        int lado2 = 4;
        int lado3 = 5;

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los lados " + lado1 + ", " + lado2 + " y " + lado3 + " forman un triángulo válido.");
        } else {
            System.out.println("Los lados " + lado1 + ", " + lado2 + " y " + lado3 + " no forman un triángulo válido.");
        }
    }
}
