package com.example;

import java.util.Scanner;

public class sesentayseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;
        boolean longitudValida = password.length() >= 8;

        for (int i =0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if ("!@#$%^&*()-_=+[]{}|;:',.<>?/".indexOf(c) >= 0) {
                tieneCaracterEspecial = true;
            }
        }
        if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial && longitudValida) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida. Debe contener al menos una mayúscula, una minúscula, un número, un carácter especial y tener al menos 8 caracteres.");
        }
    }
}
