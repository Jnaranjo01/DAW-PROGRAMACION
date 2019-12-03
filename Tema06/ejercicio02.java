/* Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n). */

import java.util.Scanner;
import java.util.Random;

public class ejercicio02 {   
  
  public static void main(String[] args){

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int ncarta;
    int numero;
    String carta;
    String nummero;

    

    ncarta = r.nextInt(4)+1;
    numero = r.nextInt(13)+1;


          System.out.println(ncarta);

          System.out.println(numero);


    switch (ncarta) {
      case 1:
        carta = "Picas";
        break;
      
      case 2:
        carta = "Corazones";
        break;

      case 3:
        carta = "Diamantes";
        break;

      case 4:
        carta = "Tréboles";
        break;

    }

    switch (numero) {
      case 1:
        nummero = "A";
        break;

      case 2:
        nummero = "2";
        break;

      case 3:
        nummero = "3";
        break;

      case 4:
        nummero = "4";
        break;

      case 5:
        nummero = "5";
        break;

      case 6:
        nummero = "6";
        break;

      case 7:
        nummero = "7";
        break;

      case 8:
        nummero = "8";
        break;

      case 9:
        nummero = "9";
        break;

      case 10:
        nummero = "10";
        break;

      case 11:
        nummero = "J";
        break;

      case 12:
        nummero = "Q";
        break;

      case 13:
        nummero = "K";
        break;
    }

    System.out.println("Tu carta es "+nummero+" de "+carta);

  }
}
