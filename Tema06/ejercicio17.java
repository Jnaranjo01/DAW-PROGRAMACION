/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio17 {   
  
  public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int altura;
    int anchura;
    int j;
    int i;
    int posanchura;
    int posaltura;

    System.out.print("Introduzca la anchura de la pecera (Mínimo 4): ");
    anchura = s.nextInt();
    System.out.print("Introduzca la altura de la pecera (Mínimo 4): ");
    altura = s.nextInt();

   // posanchura = r.nextInt(anchura-1)+1;

  //  posaltura = r.nextInt(anchura-1)+1;

   // System.out.println(posaltura);

   // System.out.println(posanchura);

    posanchura = 3;
    posaltura = 2;


    for ( i = 0 ; i < anchura ; i++){

      System.out.print("*");

    }
    
    System.out.print("\n");
    
    for ( i = 0 ; i < (altura-2) ; i++ ){
      
      System.out.print("*");

      for ( j = 0 ; j < (anchura-2) ; j++){

        if (( posaltura == i ) && ( posanchura == j )) {

          System.out.print("&");

        } else {

        System.out.print(" ");

        }
      }

      System.out.print("*");
      
      System.out.print("\n");

    }
    
    for ( i = 0 ; i < anchura ; i++){

      System.out.print("*");

    }
}
}


/*
for ( i = 0 ; i < altura ; i++){

  j = 0; 

  if ((i == 0) || ( i == altura)){

   for ( j = 0 ; j < anchura ; j++){

     System.out.print("*");

   }

   j = 0;

  } else {

    for ( j = 0 ; j < anchura ; j++){

      if ((j == 0) || ( j == anchura)){

        System.out.print("*"); 

      } else {

        System.out.print(" ");

      }
    
      
    }

    j = 0;

  }

  System.out.println();

}
*/
