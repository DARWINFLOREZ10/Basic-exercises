package com.example;
import java.util.Scanner;
public class treintaycuatro {

    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un numero N: ");
    int numero = scanner.nextInt();
    int suma = 0;
    for (int i = 1; i <= numero; i++) {
        if (i % 2 == 0) {
            suma += i;
             System.out.println("El numero " + i + " es par");
        }
    
        
    }
   }
}
