package org.example;

import java.util.Scanner;

public class Práctica_4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean repetir1 = false;
        boolean repetir2 = false;

        do {
            try{
                do {
                    System.out.println("Introduce el multiplicando (3 cifras)");
                    num1 = teclado.nextInt();
                    repetir1 = true;
                    if (num1 < 100 || num1 > 999){
                        System.out.println("Error el número tiene que ser un número positivo de 3 cifras");
                    }
                }while (num1 < 100 || num1 > 999);

            }catch (Exception e){
                System.out.println("Error el formato tienen que ser números enteros");
            }
            teclado.nextLine();

        }while (repetir1==false);

        do {
            try{
                do {
                    System.out.println("Introduce el multiplicador (3 cifras)");
                    num2 = teclado.nextInt();
                    repetir2 = true;
                    if (num2 < 100 || num2 > 999){
                        System.out.println("Error el número tiene que ser un número positivo de 3 cifras");
                    }
                }while (num2 < 100 || num2 > 999);

            }catch (Exception e){
                System.out.println("Error el formato tiene que ser números enteros");
            }
            teclado.nextLine();

        }while (repetir2==false);
        

        String numero_string = Integer.toString(num2);
        String unidades = numero_string.substring(2);
        int unidades_int = Integer.parseInt(unidades);

        String numero_string2 = Integer.toString(num2);
        String decenas = numero_string.substring(1,2);
        int decenas_int = Integer.parseInt(decenas);

        String numero_string3 = Integer.toString(num2);
        String centenas = numero_string.substring(0,1);
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
