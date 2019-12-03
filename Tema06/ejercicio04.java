/* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
por espacios. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio04 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int num;
    
    System.out.println("Secuencia de 20 números aleatorios (comprendidos entre 1 y 10): ");

    for (int i = 0; i < 20 ;i++) {

      num = r.nextInt(10)+1;
      
      System.out.print(num+" ");

    }


  }
}
