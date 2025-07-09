package com.example;
import java.util.Scanner;
public class veintiuno {
    public static void main(String[] args) {
        
        System.out.println("Ingresael año que quieres saber si es bisiesto:");
        Scanner scanner = new Scanner(System.in);
        
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
    }
}
