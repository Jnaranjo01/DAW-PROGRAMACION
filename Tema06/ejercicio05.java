/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio05 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int num;
    int max;
    int min;
    int media;

    min = 200;
    max = 0;
    media = 0;

    for(int i = 0; i<50 ;i++){

      num = r.nextInt(99)+100;

      System.out.print(num+" ");

      if (num < min){

        min = num;

      }

      if ( max < num ){

        max = num;

      }

      media = media + num;

    }
    
    System.out.print("\n");
    
    System.out.println("El número mínimo es: "+min);

    System.out.println("El número máximo es: "+max);

    media = media/50;

    System.out.println("La media de todos los números es: "+media);

  }
}
