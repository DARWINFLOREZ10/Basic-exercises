package com.example;
import java.util.Scanner;
public class ocho {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int opcion = 0;
      
      while (opcion !=3) {

        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar"); 
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num2 = scanner.nextInt();
                int suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                System.out.print("Introduce el primer número: ");
                int num3 = scanner.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num4 = scanner.nextInt();
                int resta = num3 - num4;
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                break;
        }
        System.out.println(); // Línea en blanco para separar las iteraciones
      }
        scanner.close();
    }
}

