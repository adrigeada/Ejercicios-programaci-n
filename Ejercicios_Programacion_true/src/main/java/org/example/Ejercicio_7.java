package org.example;

import java.util.Scanner;

// Ejercicio 7. Necesitamos realizar un programa que decida por nosotros
// si tenemos que ir (o no) a comprar.
public class Ejercicio_7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String respuesta1;


        System.out.println("Tenemos tomate?");
        respuesta1 = teclado.next();
        if (respuesta1.equals ("no")){
            System.out.println("Tenemos que comprar");
        }else if (respuesta1.equals ("si")){
            System.out.println("Eres un crack! ");
        }








    }
}
