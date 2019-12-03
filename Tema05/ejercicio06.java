/* Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while. */


public class ejercicio06 {   
  
  public static void main(String[] args){

    int num;

    System.out.println("Cuenta atras de 320 a 160, de 20 en 20:");

    num = 320;

    do {

      System.out.println(num);

      num = num - 20;
      
    } while (num >= 160);

  }
}

