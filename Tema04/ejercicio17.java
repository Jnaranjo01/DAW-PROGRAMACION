import java.util.Scanner;

public class ejercicio17 {   
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);

      int num;
      
      System.out.print("Introduce un número por teclado: ");
      num = s.nextInt();

      num = (num%10);

      System.out.printf("La última cifra del número es: "+num);
      
  }
}
