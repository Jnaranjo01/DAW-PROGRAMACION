/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for. */


import java.util.Scanner;
import java.util.Random;


public class ejercicionumale {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int num;
    int numale;
    int contador;
    int nummax;
    int nummin;

    numale = r.nextInt(20);
    contador = 0;

    System.out.println("--- B  I  E  N  V  E  N  I  D  O ---\nEstas a punto de comenzar un juego en el que deberas adivinar un número aleatorio, definido del 1 al 20, Adelante! ");    
    
    System.out.println("\nInserte un número por teclado por favor: ");
    num = s.nextInt();

    do {
      contador = contador + 1;

      if( contador <= 3 ){

        if (num < numale){

          System.out.println("El número introducido es mayor al número que debes adivinar.");

        } else {

          System.out.println("El número introducido es menor al número que debes adivinar.");

        }
      }

      System.out.println("\nInserte un número por teclado por favor: ");
      num = s.nextInt();

    } while ( num != numale );

    System.out.println("**** Genial! Has adivinado el número ****");

  }
}
