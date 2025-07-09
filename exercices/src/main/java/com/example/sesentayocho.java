package com.example;

import java.util.Scanner;

public class sesentayocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";

        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}
