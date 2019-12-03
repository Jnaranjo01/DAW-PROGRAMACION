/* Muestra la tabla de multiplicar de un número introducido por teclado. */

import java.util.Scanner;

public class ejercicio08 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);

    int num;
    int resultado;
    int mult;

    System.out.println("Inserte el número que quieras saber la tabla de multiplicar: ");

    num = s.nextInt();

    System.out.println("A parte dime hasta que numero quieres que te muestre la multiplicación: ");

    mult = s.nextInt();
    
    System.out.println("--- Tabla de los multiplos de "+num+" hasta "+mult+" ---");
    
    for (int cont = 0; cont <= mult; cont++){


      resultado = cont*num;
      System.out.println(resultado);

    }
  }
}
