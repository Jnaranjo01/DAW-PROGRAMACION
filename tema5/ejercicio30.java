/* Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio30 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int dia1;
    int dia2;
    int hora1;
    int hora2;
    double diasfinales;
    double horasfinales;
    
    System.out.println("--- Calculadora De Horas Entre Dias ---");

    System.out.println("Día y hora del primer día");

    System.out.println("Introduzca un dia de la semana, número del 1 al 7.");
    dia1 = s.nextInt();

    System.out.println("Introduzca la hora del día, entre 1 y 24.");
    hora1 = s.nextInt();

    System.out.println("Día y hora del segundo día");

    System.out.println("Introduzca un dia de la semana, número del 1 al 7.");
    dia2 = s.nextInt();

    System.out.println("Introduzca la hora del día, entre 1 y 24.");
    hora2 = s.nextInt();

    switch (dia1) {
      case 1:
        hora1 = hora1;
        break;

      case 2:
        hora1 = hora1 + 24;
        break;

      case 3:
      hora1 = hora1 + 48;        
        break;

      case 4:
      hora1 = hora1 + 72;        
        break;

      case 5:
      hora1 = hora1 + 96;        
        break;

      case 6:
      hora1 = hora1 + 120;        
        break;

      case 7:
      hora1 = hora1 + 144;        
        break;
    
      default:
      System.out.println("No introduciste un número del 1 al 7, por tanto no se corresponde con ningún dia de la semena y no funcionará");
        break;
    }

    switch (dia2) {
      case 1:
      hora2 = hora2;
        break;

      case 2:
      hora2 = hora2 + 24;
        break;

      case 3:
      hora2 = hora2 + 48;        
        break;

      case 4:
      hora2 = hora2 + 72;        
        break;

      case 5:
      hora2 = hora2 + 96;        
        break;

      case 6:
      hora2 = hora2 + 120;        
        break;

      case 7:
      hora2 = hora2 + 144;        
        break;
    
      default:
      System.out.println("No introduciste un número del 1 al 7, por tanto no se corresponde con ningún dia de la semena y no funcionará");
        break;
    }

    diasfinales = (hora2 - hora1)/24;

    horasfinales = (hora2 - hora1)%24;

    System.out.println("Han pasado "+diasfinales+" Dias y "+horasfinales+" horas entre los días introducidos");
  }
}
