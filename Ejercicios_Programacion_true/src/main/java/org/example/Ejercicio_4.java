package org.example;
// Ejercicio 4 (hecho en DFD). Realizar un programa para calcular el mínimo de 3 números  leídos desde teclado.
// En caso de que el usuario introduzca dos o tres números iguales, informaremos con el siguiente mensaje:
//"ERROR: hay números introducidos que son iguales".

import java.util.Scanner;

public class Ejercicio_4 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe número A ");
        double numeroA = teclado.nextDouble();
        System.out.println("Escribe número B ");
        double numeroB = teclado.nextDouble();
        System.out.println("Escribe número C ");
        double numeroC = teclado.nextDouble();

        if (numeroA<numeroB && numeroB<numeroC){
            System.out.println("El número A es el menor");

        }else {
            if (numeroB<numeroA && numeroB<numeroC){
                System.out.println("El numero B es el menor");
            }else {
                if (numeroC<numeroB && numeroC<numeroA){
                    System.out.println("El número C es el menor");

                }
            }
        }




    }
}
