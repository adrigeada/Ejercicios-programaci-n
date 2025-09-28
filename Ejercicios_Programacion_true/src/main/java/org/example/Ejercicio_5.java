package org.example;
// Ejercicio 5. Realizar un programa para dividir dos números leídos por teclado
// y escribir el resultado. Se debe controlar que el divisor no sea igual a 0 e
// informaremos con el siguiente mensaje: "ERROR: no se puede dividir entre 0".

import java.util.Scanner;

public class Ejercicio_5{
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Escribe otro número: ");
        double num2 = teclado.nextDouble();

        if (num2 == 0 ) {
            System.out.println("ERROR: no se puede dividir entre 0 ");

        }else {System.out.println("El resultado es: " + num1 / num2);

        }
    }
}
