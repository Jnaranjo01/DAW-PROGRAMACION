import java.util.Scanner;

public class ejercicionumerospares{
  
    public static void main(String[] args){
      
      Scanner s = new Scanner (System.in);
  
      int num1,num2;

      
      System.out.println("Introduce un número entero");
      num1 = s.nextInt();
      System.out.println("Introduce otro número entero");
      num2 = s.nextInt();
      
      
      
      if ((num1 % 2) == 0 ){
        
        if ((num2 % 2) == 0){
            
          System.out.println("Los dos números son pares");
        
        } else {
          
          System.out.println("El primer número es par, y el segundo es impar");
          
          }
      
      } else {
        
        if ((num2 % 2) == 0){
            
          System.out.println("EL primer número es impar, y el segundo par");
        
        } else {
          
          System.out.println("Ambos números son impares");
        
        } 
      }
  }
}
