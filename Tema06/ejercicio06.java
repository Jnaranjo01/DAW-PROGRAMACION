/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio06 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int num;
    int num1;

    num = r.nextInt(101);

    for (int i = 1 ; i <= 5 ; i++){

      System.out.println("Dime un número entre 0 y 100: ");

      num1 = s.nextInt();

      if ( num == num1){

        i = i + 5;

        System.out.println("¡Has acertado el número!");

      } else if ( num < num1){

        System.out.println("El número introducido es mayor al secreto");
        System.out.println("Te quedan "+(5-i)+" intentos");

      } else if ( num > num1){

        System.out.println("El número introducido es menor al secreto");
        System.out.println("Te quedan "+(5-i)+" intentos");

      }
    }
}
}
