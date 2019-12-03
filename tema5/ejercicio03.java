/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while. */


public class ejercicio03 {   
  
  public static void main(String[] args){

    int num;

    System.out.println("Múltiplos del 5, de 0 a 100: ");

    num = 0;

    do {

      System.out.println(num);

      num = num + 5;
      
    } while (num < 101);

  }
}
