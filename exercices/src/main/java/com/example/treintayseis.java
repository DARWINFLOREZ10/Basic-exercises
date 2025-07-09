package com.example;


public class treintayseis {
    public static void main(String[] args) {
       for ( int base =1; base<=5; base++) {
        System.out.println("Tabla del " + base +":");
        for (int i = 1; i <= 10; i++) {
            int resultado = base * i;
            System.out.println(base + " x " + i + " = " + resultado);
        }
        System.out.println(); 
       }

    }
}
