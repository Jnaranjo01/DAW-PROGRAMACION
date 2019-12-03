/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */

import java.util.Scanner;
import java.util.Random;

public class ejercicio01 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int num1;
    int num2;
    int num3;
    int suma;
    
    suma = 0;
    
    System.out.println("La tirada de 3 dados: ");

    num1 = r.nextInt(6)+1;
    num2 = r.nextInt(6)+1;
    num3 = r.nextInt(6)+1;

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);

    suma = num1 + num2 + num3;
    
    System.out.println("La suma de los 3 dados es: "+suma);    
  }
}
