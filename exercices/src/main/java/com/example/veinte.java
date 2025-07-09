package com.example;
import java.util.Scanner;
public class veinte {
    public static void main(String[] args) {
        System.out.println("Ingresa el número que quieres invertir: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int original = n;
        int invertido = 0;

    while (n != 0) {
        int digito = n % 10;
        invertido = invertido * 10 + digito;
        n /= 10;
    }
 System.out.print("El número " + original + " invertido es: " + invertido);
        scanner.close();
    }
}
