/* Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”. */

import java.util.Scanner;
import java.util.Random;

public class ejercicio16 {   
  
  public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    Random r = new Random();

    int fig;
    int fig1;
    int fig2;

    fig = r.nextInt(5)+1;
    fig1 = r.nextInt(5)+1;
    fig2 = r.nextInt(5)+1;
    
    System.out.println(" --- MÁQUINA TRAGAPERRAS ---");

    switch (fig){
      case 1:
          System.out.print(" Corazón ");
        break;
      case 2:
          System.out.print(" Diamante ");
        break;
      case 3:
          System.out.print(" Herradura ");
        break;
      case 4:
          System.out.print(" Campana ");
        break;
      case 5:
          System.out.print(" Límon ");
        break;
    }
    switch (fig1){
      case 1:
          System.out.print(" Corazón ");
        break;
      case 2:
          System.out.print(" Diamante ");
        break;
      case 3:
          System.out.print(" Herradura ");
        break;
      case 4:
          System.out.print(" Campana ");
        break;
      case 5:
          System.out.print(" Límon ");
        break;
    }
    switch (fig2){
      case 1:
          System.out.print(" Corazón ");
        break;
      case 2:
          System.out.print(" Diamante ");
        break;
      case 3:
          System.out.print(" Herradura ");
        break;
      case 4:
          System.out.print(" Campana ");
        break;
      case 5:
          System.out.print(" Límon ");
        break;
    }

    System.out.print("\n");
    
    if (( fig != fig1) && ( fig != fig2) && ( fig2 != fig1)) {

      System.out.println(" Lo siento, ha perdido");

    } else if ((( fig == fig1 ) || ( fig == fig2 ) || ( fig1 == fig2)) && !(( fig == fig1 ) && ( fig == fig2 ) && ( fig1 == fig2))) {

      System.out.println(" Bien, ha recuperado su moneda");

    } else if (( fig == fig1 ) && ( fig == fig2 ) && ( fig1 == fig2)) {

      System.out.println(" Enhorabuena, ha ganado 10 monedas");

    }
}
}
