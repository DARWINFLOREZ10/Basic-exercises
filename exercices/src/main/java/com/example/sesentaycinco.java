package com.example;

import java.util.Scanner;

public class sesentaycinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
 System.out.print("Escribe una frase: ");
        String frase = scanner.nextLine().toLowerCase(); 

     
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < frase.length(); j++) {
            char c = frase.charAt(j);
            switch (c) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
            }
        }

       
        System.out.println("\nCantidad de cada vocal:");
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }
}
