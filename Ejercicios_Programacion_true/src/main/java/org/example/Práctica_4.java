package org.example;

import java.util.Scanner;

public class Práctica_4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        do {
            System.out.println("Introduce el multiplicando (3 cifras)");
            num1 = teclado.nextInt();
            if (num1 <= 0 || num1 < 100 || num1 > 999){
                System.out.println("Error el número tiene que ser de 3 cifras");
            }
        }while (num1 <= 0 || num1 < 100 || num1 > 999);

        do {
            System.out.println("Introduce el multiplicador (3 cifras)");
            num2 = teclado.nextInt();
            if (num2 <= 0 || num2 < 100 || num2 > 999){
                System.out.println("Error el número tiene que ser de 3 cifras");
            }

        }while (num2 <= 0 || num2 < 100 || num2 > 999);


        String numero_string = Integer.toString(num2);
        String unidades = numero_string.substring(2);
        int unidades_int = Integer.parseInt(unidades);

        String numero_string2 = Integer.toString(num2);
        String decenas = numero_string.substring(1,2);
        int decenas_int = Integer.parseInt(decenas);

        String numero_string3 = Integer.toString(num2);
        String centenas = numero_string.substring(1);
        int centenas_int = Integer.parseInt(centenas);


        System.out.println("El producto de la multiplicación es: " +num1 * num2);
        System.out.println("El proceso es: ");
        System.out.println("   " +num1);
        System.out.println("  x" +num2);
        System.out.println("-------");
        System.out.println("   " +unidades_int * num1);
        System.out.println("  "+decenas_int * num1+ "x");
        System.out.println(centenas_int * num1+ "xx");
        System.out.println("-------");
        System.out.println(num1 * num2);




    }
}
