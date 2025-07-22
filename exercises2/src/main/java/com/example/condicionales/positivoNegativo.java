package com.example.condicionales;

public class positivoNegativo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        scanner.close();
    }
}
