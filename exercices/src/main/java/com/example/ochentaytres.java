package com.example;
import java.util.Random;
import java.util.Scanner;

public class ochentaytres {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    int numeroSecreto = random.nextInt(100) + 1;
    int intento= 0;
    int intentos= 0;

    System.out.println("¡Adivina el numero entre el 1 al 100:!");

    while (intento != numeroSecreto) {
        System.out.print("Introduce un numero: ");
        intento = scanner.nextInt();
        intentos++;

        if (intento < numeroSecreto) {
            System.out.println("El numero es mayor.");
        } else if (intento > numeroSecreto) {
            System.out.println("El numero es menor.");
        } else {
            System.out.println("¡Felicidades! Has adivinado el numero en " + intentos + " intentos.");
        }
    }

}
}
