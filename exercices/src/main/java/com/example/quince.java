package com.example;
import java.util.Scanner;
public class quince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuantos números vas a ingresar: ");
        int cantidad = scanner.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }
        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);
    }
}