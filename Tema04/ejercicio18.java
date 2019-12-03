/* Escribe un programa que diga cuál es la primera cifra de un número entero 
introducido por teclado. Se permiten números de hasta 5 cifras. */

import java.util.Scanner;

public class ejercicio18 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);

      int num;
      
      System.out.print("Introduce un número por teclado: ");
      num = s.nextInt();

      if (num < 10){

        System.out.println("El primer y único número es: "+num);

      }  
      if (( num > 9 ) && ( num < 100)){

        num = num / 10;
        System.out.println("El primer número es: "+num);

      } 
      
      if (( num > 99 ) && ( num < 1000)){

        num = num / 100;
        System.out.println("El primer número es: "+num);

      } 

      if (( num > 999 ) && ( num < 10000)){

        num = num / 1000;
        System.out.println("El primer número es: "+num);

      } 

      if (( num > 9999 ) && ( num < 100000)){

        num = num / 10000;
        System.out.println("El primer número es: "+num);

      } 
  }
}
