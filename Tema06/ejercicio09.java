/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio09 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int num;
    int cont;
    
    cont = 1;

    num = r.nextInt(101);

    while( num != 24 ){

      cont = cont + 1;

      num = r.nextInt(101);

    }

    System.out.println("Se han generado "+cont+" antes que el 24");

}
}
