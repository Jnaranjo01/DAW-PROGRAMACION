/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio12 {   
  
  public static void main(String[] args)
    throws InterruptedException{

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int car;

    System.out.print("\033[32m");

    for ( int i = 0 ; i < 61 ; i++){

      car = r.nextInt(94)+32;
      
      System.out.print((char)car);

      if ( i == 60) {
        i = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }
}
}
