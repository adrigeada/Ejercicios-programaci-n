package org.example;
// Ejercicio 4 (hecho en DFD). Realizar un programa para calcular el mínimo de 3 números  leídos desde teclado.
// En caso de que el usuario introduzca dos o tres números iguales, informaremos con el siguiente mensaje:
//"ERROR: hay números introducidos que son iguales".

import java.util.Scanner;

public class Ejercicio_4{

    static void main() {
        Scanner teclado = new Scanner(System.in);
        double nu
do {
    System.out.println("Escribe número A ");
    double numeroA = teclado.nextDouble();
    System.out.println("Escribe número B ");
    double numeroB = teclado.nextDouble();
    System.out.println("Escribe número C ");
    double numeroC = teclado.nextDouble();

<<<<<<< HEAD
} while (numeroC == numeroA || numeroC == numeroB);
=======
            System.out.println("Escribe número A ");
            double numeroa = teclado.nextDouble();
            System.out.println("Escribe número B ");
            double numerob = teclado.nextDouble();
            System.out.println("Escribe número C ");
            double numeroc = teclado.nextDouble();
>>>>>>> 6713ba6ed134bab6450e91321c7f11c6f678091c

            if (numeroa<numerob && numerob<numeroc){
                System.out.println("El número A es el menor");

            }else {
                if (numerob<numeroa && numerob<numeroc){
                    System.out.println("El numero B es el menor");
                }else {
                    if (numeroc<numerob && numeroc<numeroa){
                        System.out.println("El número C es el menor");

                    }else {
                        if (numeroa == numerob || numeroa == numeroc || numerob == numeroc) {
                            System.out.println("ERROR: hay números introducidos que son iguales ");
                        }

                    }
                }
            }







    }
}
