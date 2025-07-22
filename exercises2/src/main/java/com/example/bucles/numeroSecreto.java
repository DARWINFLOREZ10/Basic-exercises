package com.example.bucles;

public class numeroSecreto {
    public static void main(String[] args) {
        int numeroSecreto = 7;
        int intentos = 0; 
        int numeroUsuario = -1; 
        
        while (numeroUsuario != numeroSecreto) {
            System.out.print("Adivina el número secreto (entre 1 y 10): ");
            
          

          
            numeroUsuario = (int) (Math.random() * 10) + 1; 

            intentos++; 
            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número secreto en " + intentos + " intentos.");
            }
        }
    }
}
