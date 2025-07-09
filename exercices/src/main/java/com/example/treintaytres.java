package com.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class treintaytres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero");
String  numero = scanner.nextLine();
Set<Character> digitos = new HashSet<>();
        boolean repetido = false;

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (digitos.contains(c)) {
                repetido = true;
                break;
            }
            digitos.add(c);
        }

        if (repetido) {
            System.out.println("El número tiene cifras repetidas.");
        } else {
            System.out.println("El número NO tiene cifras repetidas.");
        }
    }
}
