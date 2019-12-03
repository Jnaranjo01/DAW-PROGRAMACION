/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while. */


public class ejercicio02 {   
  
  public static void main(String[] args){

    int num;

    System.out.println("Múltiplos del 5, de 0 a 100: ");

    num = 0;

    while ( num < 101 ){

      System.out.println(num);

      num = num + 5;

    }
  }
}
