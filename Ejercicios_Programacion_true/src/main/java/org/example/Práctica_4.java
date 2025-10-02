package org.example;

import java.util.Scanner;

public class Práctica_4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el multiplicando (3 cifras)");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el multiplicador (3 cifras)");
        int num2 = teclado.nextInt();

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
