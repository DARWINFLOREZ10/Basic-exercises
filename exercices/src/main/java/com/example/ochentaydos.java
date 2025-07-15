package com.example;

import java.util.Scanner;

public class ochentaydos {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese una contraseña: ");
    String password = scanner.nextLine();
    
    if (password.length()<6 && !password.contains(" ")){
        System.out.print("contraseña valida");
    }
    else {
        System.out.print("contraseña invalida");
        if (password.length() < 6) {
            System.out.println(" - La contraseña debe tener al menos 6 caracteres.");
        }
        if (password.contains("")) {
            System.out.println(" - La contraseña no debe contener espacios en blanco.");
        }
    }


}
}
