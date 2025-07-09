package com.example;

public class cuarentayocho {
    public static void main(String[] args) {
        int [] arreglos = {1, 2, 3, 4, 5, 6, 7, 18, 9, 10};
        int suma = 0;

        for (int i = 0; i < arreglos.length; i++) {
            suma += arreglos[i];
        }
        System.out.println("La suma de los elementos en posicionese pares es: " + suma);
    }
}
