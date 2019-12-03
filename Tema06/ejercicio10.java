/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio10 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int numcar;
    int car;

    for ( int i = 1 ; i <= 10 ; i++ ){

      numcar = r.nextInt(40)+1;

      car = r.nextInt(6)+1;

      for ( int cont = 1 ; cont <= numcar ; cont++ ) {

        switch (car) {
          case 1:
              System.out.print("*");
            break;
          case 2:
              System.out.print("-");
            break;
          case 3:
              System.out.print("=");
            break;
          case 4:
              System.out.print(".");
           break;
          case 5:
              System.out.print("|");
            break;
          case 6:
              System.out.print("@");
            break;
        }
      }
      
      System.out.print("\n");
      
    }
}
}
