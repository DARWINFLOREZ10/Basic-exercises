package com.example;

public class treintaynueve {
    public static void main(String[] args) {
        int [] numeros = {5,1,8,3,2,4,6,7,9,10};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
}
