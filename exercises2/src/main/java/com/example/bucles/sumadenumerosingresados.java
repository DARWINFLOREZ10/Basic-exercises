package com.example.bucles;

public class sumadenumerosingresados {
    public static void main(String[] args) {
        int suma = 0;
        int numero;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = Integer.parseInt(System.console().readLine());

            if (numero != 0) {
                suma += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
