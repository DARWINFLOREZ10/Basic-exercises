package com.example;

import java.util.Scanner;

public class setentaysiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        boolean repetida = false;

        for(int i = 0; i < palabra.length(); i++){
            for(int j = i + 1; j < palabra.length(); j++){
                if(palabra.charAt(i) == palabra.charAt(j)){
                    repetida = true;
                    break;
                }
            }
            if(repetida) {
                break;
            }
        }
        if(repetida) {
            System.out.println("La palabra contiene letras repetidas.");
        } else {
            System.out.println("La palabra no contiene letras repetidas.");
        }
    }
}
