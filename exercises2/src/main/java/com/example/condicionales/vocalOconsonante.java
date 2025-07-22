package com.example.condicionales;

public class vocalOconsonante {
    public static void main(String[] args) {
        char letra = 'a'; 

        if (Character.isLetter(letra)) {
            if ("aeiouAEIOU".indexOf(letra) != -1) {
                System.out.println(letra + " es una vocal.");
            } else {
                System.out.println(letra + " es una consonante.");
            }
        } else {
            System.out.println(letra + " no es una letra válida.");
        }
    }
}
