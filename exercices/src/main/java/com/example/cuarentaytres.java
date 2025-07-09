package com.example;
import java.util.Scanner;
public class cuarentaytres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        boolean soloNumeros = true;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!Character.isDigit(caracter)) {
                soloNumeros = false;
                break;
            }
        }
        if (soloNumeros) {
            System.out.println("La cadena contiene solo números.");
        } else {
            System.out.println("La cadena contiene caracteres no numéricos.");
        }
    }
}
