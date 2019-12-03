/* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. */

import java.util.Scanner;

public class ejercicio19 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);

      int num;
      
      System.out.print("Introduce un número por teclado: ");
      num = s.nextInt();

      if (num == 0){

        System.out.println("El número tiene 1 dígito.");

      } 

      if (( num > 0 ) && ( num < 10 )){

        System.out.println("El número tiene 1 dígito.");

      } 

      if (( num > 9 ) && ( num < 100 )){

        System.out.println("El número tiene 2 dígito.");

      } 

      if (( num > 99 ) && ( num < 1000 )){

        System.out.println("El número tiene 3 dígito.");

      } 

      if (( num > 999 ) && ( num < 10000 )){

        System.out.println("El número tiene 4 dígito.");

      } 

      if (( num > 9999 ) && ( num < 100000 )){

        System.out.println("El número tiene 5 dígito.");

      }
      
      if (( num > -10 ) && ( num < 0 )){

        System.out.println("El número tiene 1 dígito.");

      } 

      if (( num > -100 ) && ( num < -9 )){

        System.out.println("El número tiene 2 dígito.");

      } 

      if (( num > -1000 ) && ( num < -99 )){

        System.out.println("El número tiene 3 dígito.");

      } 

      if (( num > -10000 ) && ( num < -999 )){

        System.out.println("El número tiene 4 dígito.");

      } 

      if (( num > -100000 ) && ( num < -9999 )){

        System.out.println("El número tiene 5 dígito.");

      } 
  }
}
