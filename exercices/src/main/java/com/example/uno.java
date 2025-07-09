package com.example;
import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
    System.out.println("Ingresa la base del triángulo");
    double base = scanner.nextDouble();

    System.out.println("Ingresa la altura del triangulo");
    double altura = scanner.nextDouble();

double area = (base * altura) / 2;
System.out.println("el area del triangulo es:" + area);

scanner.close();
    }
    
    
}
