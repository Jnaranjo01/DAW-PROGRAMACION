import java.util.Scanner;

public class ejercicio01{
  public static void main(String[] args){
  Scanner s = new Scanner (System.in);
  
  int resultado;
  
    System.out.println("Introduce los números por teclado a los que quieres que se haga la multiplicación");
    
   int num1 = s.nextInt();
   int num2 = s.nextInt();
  
   resultado = num1*num2;
   
   System.out.println("El resultado es: " +resultado);
  }
}
