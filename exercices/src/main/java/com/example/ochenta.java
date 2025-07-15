package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ochenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine().toLowerCase();

        String[] palabras = frase.split(" ");
        
        Map<String, Integer> contador = new HashMap<>();
        for (String palabra : palabras) {
            if (contador.containsKey(palabra)) {
                contador.put(palabra, contador.get(palabra) + 1);
            } else {
                contador.put(palabra, 1);
            }
        }
        System.out.println("Palabras y sus frecuencias:");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
