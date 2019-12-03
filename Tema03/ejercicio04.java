import java.util.Scanner;

public class ejercicio04{
  public static void main(String[] args){
  Scanner s = new Scanner (System.in);
  
  float resultado;
  
  System.out.println("Dime dos números");
  
  float num1 = s.nextFloat();
  float num2 = s.nextFloat();

  resultado= num1 +num2;
  System.out.printf("La suma de ambos números es %.0f\n",resultado);
   
  resultado= num1 -num2;
  System.out.printf("La resta (el primero menos el segundo) de ambos números es %.0f\n",resultado);

  resultado= num1*num2;
  System.out.printf("La multiplicación de ambos números es %.2f\n",resultado);
  
  resultado= num1/num2;
  System.out.printf("La división de ambos números (el primero menos el segundo) es %.2f\n",resultado);
  }
}
