package com.example;
import java.util.Scanner;
public class cuarentayuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero:");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.print("Ingresa el tercer numero:");
        int numero3 = scanner.nextInt();

        System.out.print("Orden de mayor a menor:");

        if ( numero1 >= numero2 && numero1 >= numero3) {
            System.out.print(numero1 + " ");
            if (numero2 >= numero3) {
                System.out.print(numero2 + " " + numero3);
            } else {
                System.out.print(numero3 + " " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.print(numero2 + " ");
            if (numero1 >= numero3) {
                System.out.print(numero1 + " " + numero3);
            } else {
                System.out.print(numero3 + " " + numero1);
            }
        } else {
            System.out.print(numero3 + " ");
            if (numero1 >= numero2) {
                System.out.print(numero1 + " " + numero2);
            } else {
                System.out.print(numero2 + " " + numero1);
            }
        }
    }
}
