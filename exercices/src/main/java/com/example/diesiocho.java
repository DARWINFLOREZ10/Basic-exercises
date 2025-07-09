package com.example;
import java.util.Scanner;
public class diesiocho {
    public static void main(String[] args) {
        
        System.out.print("Ingresa un número N:");
        Scanner scanner = new Scanner(System.in);
      
        int n = scanner.nextInt();

        for (int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}
